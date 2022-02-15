package com.programacionOO.tema8.Practica3;

import com.programacionOO.libs.Util;
import com.programacionOO.tema8.practicaCajero.Bombo;

import java.util.GregorianCalendar;

public class Practica3 {
    private final Bombo nuevoNia = new Bombo(Config.CANTIDAD_ALUMNOS,Config.INDICE);
    private final Bombo nuevoTel = new Bombo(Config.CANTIDAD_ALUMNOS,Config.INDICE_TEL);

    private int contador = 0;
    private Alumno[] alumnos;

    public Practica3() {
        crearDatosPrueba();
        mostrarOpciones();
        opcionesMenu();
    }

    private void mostrarOpciones() {
        System.out.println("*********************");
        System.out.println("** GESTIÓN ALUMNOS **");
        System.out.println("*********************");
        System.out.println("1. Nuevo alumno ...");
        System.out.println("2. Baja de alumno ...");
        System.out.println("3. Consultas ...");
        System.out.println("----------------------");
        System.out.println("0. Salir ");
    }

    private void opcionesMenu() {
        int opcion;
        do {
            opcion = Util.askInteger("Elije una opción disponible");
        } while (opcion < 0 || opcion > 3);

        switch (opcion) {
            case 1://TODO : Nuevo alumno
                alumnos = arrayFull();//comprobacion array no lleno
                alumnos[contador] = nuevoAlumno(); //cambiar contador despues de pruebas
                break;
            case 2://TODO : Borrar alumno //1-busca //2-confirma //2a-elimna //3-cancela
                borrarAlumno(Util.askLong("Intruce el nia del alumno"));
                break;
            case 3://TODO : Consultas sobre alumno
                break;
            case 0:
                System.out.println("\nHasta pronto ...");
                break;
        }
    }

    private Alumno[] arrayFull() {
        int ultimaPosicion = alumnos.length - 1;
        double extraPosicion = alumnos.length * 1.5;//puede fallar si el array es demasiado grande
        // si Alumno[] esta completo
        // crear un nuevo Alumno[] con 2 mas de posiciones
        // rellenar el array con posicones nuevas
        if(alumnos[ultimaPosicion].getNia() != 0){
            Alumno[] alumnosExtra = new Alumno[(int)extraPosicion];
            for (int i = 0; i < alumnosExtra.length; i++) {
                alumnosExtra[i] = alumnos[i];
            }
            return alumnosExtra;
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

    private void opcionesConsultas(){

    }


    private void crearDatosPrueba() {

        alumnos = new Alumno[Config.CANTIDAD_ALUMNOS];

        //todo : alumnos mayores de x edad
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
