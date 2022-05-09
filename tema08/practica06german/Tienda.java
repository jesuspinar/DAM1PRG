package com.programacionOO.tema08.practica06german;

import com.programacionOO.libs.Util;
import org.w3c.dom.ranges.RangeException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tienda {
    private final Bicicleta[] bicicletas;
    private int nReferencias;

    private static final String[] marcas = {"Orbea", "Merida", "Giant", "Cube", "BH", "Lapierre", "MTP", "Trek", "Scott", "BMC", "Canyon", "Look", "Megamo", "Pinarello", "Bianchi", "Factor"};
    private static final String[] modelos = {"Titán", "Obleus", "Morpheus", "Deep", "Runner", "CSC", "Antares", "Cepheid", "Monster"};
    /** ID se utiliza para asegurar que al generar bicicletas aleatorias la referencia sea única **/
    private static int ID = 0;

    public Tienda(int nBicicletas) {
        nReferencias = 0;
        bicicletas = new Bicicleta[Config.MAX_BICICLETAS];
        generarDatosAleatorios(nBicicletas);
    }

    private void generarDatosAleatorios(int nBicicletas) {
        for(int i = 0; i < nBicicletas; i++) {
            bicicletas[i] = bicicletaAleatoria();
            nReferencias++;
        }
    }

    private Bicicleta bicicletaAleatoria() {
        ID++;
        String referencia = "B-" + String.format("%04d", ID);
        String marca = marcas[Util.random(0, marcas.length -1)];
        String modelo = modelos[Util.random(0, modelos.length -1)];
        float peso = Util.randomFloat(2,25f);
        float tamanyo = Util.randomFloat(5,30f);
        boolean motor = Util.random(0, 1) == 1;
        int currentYear = new GregorianCalendar().get(Calendar.YEAR);
        GregorianCalendar fechaFabricacion = new GregorianCalendar(Util.random(currentYear - 7, currentYear), Util.random(Calendar.JANUARY, Calendar.DECEMBER), Util.random(1,28));
        float precio = Util.randomFloat(99,2500f);
        int stock = Util.random(0, 7);
        return new Bicicleta(referencia, marca, modelo, peso, tamanyo, motor, fechaFabricacion, precio, stock);
    }

    public boolean anyadirStock(String referencia, int unidades) throws RangeException {
        Bicicleta bicicleta = buscarBicicletaPorReferencia(referencia);
        // Si la referencia ya existe, incrementamos su stock
        if(bicicleta != null) {
            bicicleta.comprar(unidades);
            return true;
        }
        return false;
//        throw new RangeException("Reference not exist");
    }

    public ResultadoOperacion nuevaBicicleta(String referencia, String marca, String modelo, float peso, float tamanyo, boolean motor,
                                  GregorianCalendar fechaFabricacion, float precio, int unidades) {
        Bicicleta bicicleta = buscarBicicletaPorReferencia(referencia);
        // Si la referencia ya existe, incrementamos su stock
        if(bicicleta != null) {
            anyadirStock(referencia, unidades);
        } else if(nReferencias < Config.MAX_BICICLETAS) {
            bicicletas[nReferencias] = new Bicicleta(referencia, marca, modelo, peso, tamanyo, motor, fechaFabricacion, precio, unidades);
            nReferencias++;
            return ResultadoOperacion.ADDED;
        }
        return ResultadoOperacion.SPACE_LIMIT_EXCEEDE0D;
    }

    public ResultadoOperacion venderBicicleta(String referencia, int cantidad) {
        Bicicleta bicicleta = buscarBicicletaPorReferencia(referencia);
        if(bicicleta != null) {
            if (bicicleta.vender(cantidad)) {
                return ResultadoOperacion.UPDATED;
            } else {
                return ResultadoOperacion.INSUFFICIENT_STOCK;
            }
        } else {
            return ResultadoOperacion.NOT_FOUND;
        }
    }

    public Bicicleta buscarBicicletaPorReferencia(String referencia) {
        for(int i = 0; i < nReferencias; i++) {
            if (bicicletas[i].getReferencia().toLowerCase().equals(referencia.toLowerCase())) {
                return bicicletas[i];
            }
        }
        return null;
    }

    public Bicicleta[] buscarBicicletaPorMarca(String marca) {
        Bicicleta[] bicicletasMarca = null;
        /** Lo ideal sería hacerlo con ArrayLists pero aún no los hemos visto */
        /** Calculamos primero cuantas bicicletas hay que coincidan con el criterio de búsqueda **/
        int nBicicletas = 0;
        //Convertimos a minúsculas
        marca = marca.toLowerCase();

        for(int i = 0; i < nReferencias; i++) {
            if (bicicletas[i].getMarca().toLowerCase().contains(marca)) {
                nBicicletas++;
            }
        }
        if(nBicicletas > 0) {
            bicicletasMarca = new Bicicleta[nBicicletas];
            int cont = 0;
            /** Una vez sabemos el número de bicicletas las asignamos al vector **/
            for(int i = 0; i < nReferencias; i++) {
                if (bicicletas[i].getMarca().toLowerCase().contains(marca)) {
                    bicicletasMarca[cont] = bicicletas[i];
                    cont++;
                }
            }
        }
        return bicicletasMarca;
    }

    public Bicicleta[] buscarBicicletaPorModelo(String modelo) {
        Bicicleta[] bicicletasModelo = null;
        /** Lo ideal sería hacerlo con ArrayLists pero aún no los hemos visto */
        /** Calculamos primero cuantas bicicletas hay que coincidan con el criterio de búsqueda **/
        int nBicicletas = 0;
        //Convertimos a minúsculas
        modelo = modelo.toLowerCase();

        for(int i = 0; i < nReferencias; i++) {
            if (bicicletas[i].getModelo().toLowerCase().contains(modelo)) {
                nBicicletas++;
            }
        }
        if(nBicicletas > 0) {
            bicicletasModelo = new Bicicleta[nBicicletas];
            int cont = 0;
            /** Una vez sabemos el número de bicicletas las asignamos al vector **/
            for(int i = 0; i < nReferencias; i++) {
                if (bicicletas[i].getModelo().toLowerCase().contains(modelo)) {
                    bicicletasModelo[cont] = bicicletas[i];
                    cont++;
                }
            }
        }
        return bicicletasModelo;
    }

    public Bicicleta get(int pos) {
        return bicicletas[pos];
    }

    public String stockToString() {
        StringBuilder sbStock = new StringBuilder();
        for(int i = 0; i < nReferencias; i++) {
            sbStock.append(bicicletas[i].toString() +"\n");
        }
        return sbStock.toString();
    }
}
