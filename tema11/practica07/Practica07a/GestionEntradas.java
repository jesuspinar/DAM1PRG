package com.programacionOO.tema11.practica07.Practica07a;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema11.practica07.Practica07a.Exceptions.EntradaNoExisteException;
import com.programacionOO.tema11.practica07.Practica07a.Exceptions.EntradaYaDevueltaException;
import com.programacionOO.tema11.practica07.Practica07a.Exceptions.PartidoNoValidoException;
import com.programacionOO.tema11.practica07.Practica07a.Exceptions.PartidoYaJugadoException;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class GestionEntradas {


    private final ArrayList<Partido> partidos;
    private Partido partidoActual;


    public GestionEntradas() {
        partidos = new ArrayList<>();
        partidoActual = null;
        if(Config.DEBUG) {
            generarDatosAleatorios();
        }
    }

    /**
     * Genera datos aleatorios para realizar pruebas
     */
    private void generarDatosAleatorios() {
        generarPartidosAleatorios();
        generarVentaEntradaAleatoria();
    }

    /**
     * Genera N_PARTIDOS_ALEATORIOS Partidos aleatorios
     */
    private void generarPartidosAleatorios() {
        Faker faker = new Faker(new Locale("es"));
        for(int i = 0; i < Config.N_PARTIDOS_ALEATORIOS; i++) {
            GregorianCalendar fechaPartido = new GregorianCalendar();
            Date datePartido;
            if(i < Config.N_PARTIDOS_ALEATORIOS / 2) {
                datePartido = faker.date().past(20, 1, TimeUnit.DAYS);
            } else {
                datePartido = faker.date().future(20, 1, TimeUnit.DAYS);
            }
            fechaPartido.setTime(datePartido);
            partidos.add(new Partido(fechaPartido, faker.esports().team(), faker.esports().team(),TipoPartido.random()));
        }
    }

    /**
     * Genera la venta aleatoria de Entradas
     */
    private void generarVentaEntradaAleatoria() {
        int alea;
        for(int i = 0; i < partidos.size(); i++) {
            for(int z = 0; z < Estadio.N_ZONAS; z++) {
                for(int f = 0; f < Estadio.FILAS_POR_ZONA; f++) {
                    for(int a = 0; a < Estadio.ASIENTOS_POR_FILA; a++) {
                        alea = Util.random(1, 100);
                        if(alea <= Config.PORCENTAJE_ENTRADAS_VENDIDAS) {
                            partidos.get(i).venderEntrada(z,f,a);
                        }
                    }
                }
            }
        }
    }

    public void addPartido(GregorianCalendar fecha, String local, String visitante, TipoPartido tipoPartido) {
        partidos.add(new Partido(fecha, local, visitante, tipoPartido));
    }

    public void setPartidoActual(int idPartido) throws PartidoNoValidoException, PartidoYaJugadoException {
        partidoActual = buscarPartido(idPartido);
        if(partidoActual == null) {
            throw new PartidoNoValidoException("El id del partido no es válido");
        } else if(partidoActual.getFecha().compareTo(Calendar.getInstance()) < 0) {
            throw new PartidoYaJugadoException("El partido seleccionado ya se ha jugado");
        }
    }

    public void clearPartidoActual() {
        partidoActual = null;
    }

    public Partido getPartidoActual() {
        return partidoActual;
    }

    /**
     * Busca el Partido con el id indicado como parámetro
     * @param idPartido id del Partido a buscar
     * @return Partido buscado o null en caso de no ser encontrado
     */
    private Partido buscarPartido(int idPartido) {
        for(Partido partido: partidos) {
            if(partido.getId() == idPartido) {
                return partido;
            }
        }
        return null;
    }

    /**
     * Busca los partidos
     * @param calendar
     * @return
     */
    private ArrayList<Partido> buscarPartidosPosterioresAFecha(Calendar calendar) {
        if(partidos.size() == 0)
            return null;
        ArrayList<Partido> partidosFecha = new ArrayList<>();
        for(Partido partido: partidos) {
            if(partido.getFecha().compareTo(calendar) > 0) {
                partidosFecha.add(partido);
            }
        }
        return partidosFecha;
    }

    public ArrayList<Partido> getPartidosPendientes() {
        return buscarPartidosPosterioresAFecha(Calendar.getInstance());
    }

    /**
     * Busca una entrada a partir del numeroEntrada
     * @param numeroEntrada Número de la entrada
     * @return La Entrada encontrada o null si no se ha encontrado
     */
    public Entrada buscarEntrada(int numeroEntrada) {
        for(Entrada entrada: partidoActual.getEntradas()) {
            if(entrada.getId() == numeroEntrada) {
                return entrada;
            }
        }
        return null;
    }


    /**
     * Devuelve una Entrada a partir de su número.
     * @param numeroEntrada Número de la entrada
     * @throws EntradaYaDevueltaException
     * @throws EntradaNoExisteException
     */
    public void devolverEntrada(int numeroEntrada) throws EntradaYaDevueltaException, EntradaNoExisteException {
        Entrada entrada;
        ArrayList<Entrada> entradas = partidoActual.getEntradas();
        for(int i = 0; i < entradas.size(); i++) { //Buscamos la entrada
            entrada = entradas.get(i);
            if(entrada.getId() == numeroEntrada) {
                if(entrada.devolver()) {
                    entradas.remove(i);
                    // Ha ido bien, por tanto salimos
                    return;
                } else {
                    throw new EntradaYaDevueltaException("La entrada ya ha sido devuelta");
                }
            }
        }
        throw new EntradaNoExisteException("La entrada " + numeroEntrada + " no existe");
    }


    /**
     * Obtiene la recaudación del partido actual
     * @return El dinero recaudado o 0 si no se ha seleccionado partidoActual
     */
    public double getRecaudacion() {
        if(partidoActual != null)
            return partidoActual.getRecaudacion();
        return 0;
    }


    /**
     * Vende una entrada para un asiento en una zona y filas determinadas
     * @param zona
     * @param fila
     * @param asiento
     * @return La entrada vendida o null si no se ha asignado partido actual
     */
    public Entrada venderEntrada(Zona zona, Fila  fila, Asiento asiento) {
        if(partidoActual != null)
            return partidoActual.venderEntrada(zona, fila, asiento);
        return null;
    }

    /**
     * Obtiene las zonas del estadio del partido actual
     * @return
     */
    public Zona[] getZonas() {
        if(partidoActual != null)
            return partidoActual.getEstadio().getZonas();
        return null;
    }
}
