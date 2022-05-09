package com.programacionOO.tema08.practica03;

import com.programacionOO.libs.Util;
import com.programacionOO.tema08.practicaCajero.Bombo;

import java.util.GregorianCalendar;

public class Practica03 {
    private final Bombo nuevoNia = new Bombo(Config.CANTIDAD_ALUMNOS,Config.INDICE);
    private final Bombo nuevoTel = new Bombo(Config.CANTIDAD_ALUMNOS,Config.INDICE_TEL);

    private int contador = 0;
    private Alumno[] alumnos;

    public Practica03() {
        crearDatosPrueba();
        mostrarMenu();
        opcionesMenu();
    }

    private void mostrarMenu() {
        System.out.println("*********************");
        System.out.println("** GESTIÓN ALUMNOS **");
        System.out.println("*********************");
        System.out.println("1. Nuevo alumno ...");
        System.out.println("2. Baja de alumno ...");
        System.out.println("3. Consultas ...");
        System.out.println("----------------------");
        System.out.println("0. Salir ");
    }

    private void mostrarConsultas() {
        System.out.println("***************");
        System.out.println("** CONSULTAS **");
        System.out.println("***************");
        System.out.println("1. Por grupo ...");
        System.out.println("2. Por edad ...");
        System.out.println("3. Por nia ...");
        System.out.println("4. Por apellidos ...");
        System.out.println("----------------------");
        System.out.println("0. Volver al menú principal ");
    }

    private void opcionesMenu() {
        int opcion;
        do {
            do {
                opcion = Util.askInteger("Elije una opción disponible");
            } while (opcion < 0 || opcion > 3);

            switch (opcion) {
                case 1:
                    alumnos = isArrayFull();//comprobacion array no lleno
                    alumnos[contador] = nuevoAlumno(); //cambiar contador despues de pruebas
                    break;
                case 2:
                    borrarAlumno(Util.askLong("Intruce el nia del alumno"));
                    break;
                case 3:
                    mostrarConsultas();
                    opcionesConsultas();
                    break;
                case 0:
                    System.out.println("\nHasta pronto ...");
                    break;
            }
        } while (opcion != 0);
    }

    private void opcionesConsultas(){
        int opcion;
        do {
            opcion = Util.askInteger("Elije una opción disponible");
        } while (opcion < 0 || opcion > 3);

        switch (opcion) {
            case 1://TODO : busqueda por grupoo
                buscarAlumnoPorGrupo(Util.askString("Inserte un grupo"));
                break;
            case 2://TODO : busqueda por edad
                buscarAlumnoPorEdad(Util.askInteger("Inserte la edad"));
                break;
            case 3://TODO : busqueda por nia
                System.out.println("Funcion bajo desarrollo...");
                break;
            case 4://TODO : busqueda por Apellidos
                buscarAlumnoPorApellido(Util.askString("Inserte un apellido:"));
                break;
            case 0:
                break;
        }
    }

    /*
     * si Alumno[] esta completo
     * crear un nuevo Alumno[] con 2 mas de posiciones
     * rellenar el array con posicones nuevas
     */

    public Alumno[] buscarAlumnoPorGrupo(String gurpo){
        Alumno[] alumnosGrupo;
        int numeroAlumnos = 0;
        int alumnosInsertados = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getGrupo().equalsIgnoreCase(gurpo)){
                numeroAlumnos++;
            }
        }
        if (contador > 0) {
            alumnosGrupo = new Alumno[contador];
            for (int i = 0; i < numeroAlumnos; i++) {
                if (alumnos[i].getGrupo().equalsIgnoreCase(gurpo)) {
                    alumnosGrupo[alumnosInsertados++] = alumnos[i];
                }
            }
            return alumnosGrupo;
        }
        return null;
    }
    public Alumno[] buscarAlumnoPorEdad(int edad){
        Alumno[] alumnosEdad;
        int numeroAlumnos = 0;
        int alumnosInsertados = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getEdad() == edad){
                numeroAlumnos++;
            }
        }
        if (contador > 0) {
            alumnosEdad = new Alumno[contador];
            for (int i = 0; i < numeroAlumnos; i++) {
                if (alumnos[i].getEdad() == edad) {
                    alumnosEdad[alumnosInsertados++] = alumnos[i];
                }
            }
            return alumnosEdad;
        }
        return null;
    }

    public Alumno[] buscarAlumnoPorApellido(String apellidos){
        Alumno[] alumnosApellidos;
        int numeroAlumnos = 0;
        int alumnosInsertados = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if(alumnos[i].getApellidos().toLowerCase().startsWith(apellidos.toLowerCase())){
                numeroAlumnos++;
            }
        }
        if (contador > 0) {
            alumnosApellidos = new Alumno[contador];
            for (int i = 0; i < numeroAlumnos; i++) {
                if (alumnos[i].getApellidos().toLowerCase().startsWith(apellidos.toLowerCase())) {
                    alumnosApellidos[alumnosInsertados++] = alumnos[i];
                }
            }
            return alumnosApellidos;
        }
        return null;
    }



    private Alumno[] isArrayFull() {
        int ultimaPosicion = alumnos.length - 1;
        double extraPosicion = alumnos.length * 1.5;//puede fallar si el array es demasiado grande

        if(alumnos[ultimaPosicion].getNia() != 0){
            Alumno[] alumnosExtra = new Alumno[(int)extraPosicion];
            for (int i = 0; i < alumnos.length; i++) {
                alumnosExtra[i] = alumnos[i];
            }
            alumnos = alumnosExtra; //se le pasa el puntero en memoria con las posiciones nuevas
            return alumnos;
        }
        return alumnos;
    }

    private Alumno nuevoAlumno(){

        long nia = nuevoNia.extraerBola();
        String nombre = Util.askString("Introduce el nombre del alumno");
        String apellidos = Util.askString("Introduce los apellidos del alumno");

        int anyo = Util.askInteger("Año de nacimiento ? /yyyy");
        int mes = Util.askInteger("Mes de nacimiento ? /mm");
        int dia = Util.askInteger("Dia de nacimiento ? /dd");
        GregorianCalendar fechaNacimiento = new GregorianCalendar(anyo,mes,dia);

        String grupo = Util.askString("Grupo al que participar ?");
        long telefono = Util.askLong("Teléfono móvil ?");
        Alumno nuevoAlumno = new Alumno(nia,nombre,apellidos,fechaNacimiento,grupo,telefono);

        return nuevoAlumno;
    }

    private void borrarAlumno(long nia){
        int confirm = 0;
        int ultimaPosicion = alumnos.length - 1;
        for (int i = 0; i < alumnos.length; i++) {
            if (nia == alumnos[i].getNia()){
                System.out.println("NIA encontrado ");
                imprimirAlumno(i);
                confirm = Util.askInteger("Desea eliminar ?\n0.-No\n1.-Si");
                if (confirm == 1){
                    Alumno vacio = new Alumno(1,"","",new GregorianCalendar(),
                            "",0);
                    alumnos[i] = alumnos[ultimaPosicion];
                    alumnos[ultimaPosicion] =  vacio;//Todo : preguntar si es correcto null
                    System.out.println("Alumno borrado correctamente");
                }else {
                    System.out.println("A cancelado el borrado");
                }
            }
        }

    }



    //todo: metodo buscar en array
    private void crearDatosPrueba() {

        alumnos = new Alumno[Config.CANTIDAD_ALUMNOS];

        for(int i = 0; i < alumnos.length; i++) {
            GregorianCalendar fechaNacimiento = new GregorianCalendar(
                    Util.random(2000,2022),//año
                    Util.random(1,12),//mes
                    Util.random(1,31));//dia

            alumnos[i] = new Alumno(nuevoNia.extraerBola(), "Alumno " + contador,
                    "Apellidos " + contador, fechaNacimiento,
                    "C",nuevoTel.extraerBola());
            contador++;
        }
        imprimirAlumnos();
    }
    private void imprimirAlumno(int i){
        System.out.printf(
                "\n\nNIA:\t\t\t%s\nNOMBRE:\t\t\t%s\nAPELLIDOS:\t\t%s\n" +
                        "EDAD:\t\t\t%s\nGRUPO:\t\t\t%s\nTELÉFONO:\t\t%s\n",
                alumnos[i].getNia(),
                alumnos[i].getNombre(),
                alumnos[i].getApellidos(),
                alumnos[i].getEdad(),
                alumnos[i].getGrupo(),
                alumnos[i].getTelefono());
    }

    private void imprimirAlumnos(){
        System.out.println("\n\t**** ALUMNOS ****");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf(
                    "\n\nNIA:\t\t\t%s\nNOMBRE:\t\t\t%s\nAPELLIDOS:\t\t%s\n" +
                            "EDAD:\t\t\t%s\nGRUPO:\t\t\t%s\nTELÉFONO:\t\t%s\n",
                    alumnos[i].getNia(),
                    alumnos[i].getNombre(),
                    alumnos[i].getApellidos(),
                    alumnos[i].getEdad(),
                    alumnos[i].getGrupo(),
                    alumnos[i].getTelefono());
        };
    }

}
