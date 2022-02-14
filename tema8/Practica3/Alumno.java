package com.programacionOO.tema8.Practica3;

import com.programacionOO.libs.Util;

import static com.programacionOO.tema8.Practica3.Grupo.NOTSET;

public class Alumno {
    private String nia;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String fechaNacimiento;
    private Grupo grupo;

    public Alumno() {
    }
    public boolean nuevo(){
        //Todo : datos de prueba
        /*
        String nia = "333", nombre = "Jose",
                apellido1 = "Lozano",  apellido2 = "Fernandez",
                fechaNacimiento = "22/02/1999";
        Grupo grupo = NOTSET;
        */

        /**/
        String nia, nombre,
                apellido1,  apellido2,
                fechaNacimiento;
        Grupo grupo = NOTSET;

        //comprueba que el NIA no este
        do {
            nia = Util.askString("Crea tu nia ");
        }while (nia.equalsIgnoreCase(this.nia));

        nombre = Util.askString("Cual es tu nombre");
        apellido1 = Util.askString("Cual es tu primer apellido");
        apellido2 = Util.askString("Cual es tu segundo apellido ");
        fechaNacimiento = Util.askString("Cual es tu fecha de nacimiento dd/mm/yyyy ");

        switch (Util.askInteger("Indica tu especialidad \n1.- Social \n2.- Cientifico\n3.- Artistico")){
            case 1:grupo = grupo.SOCIAL;break;
            case 2:grupo = grupo.CIENTIFICO;break;
            case 3:grupo = grupo.ARTISTICO;break;
        }
        /**/

        if (!nia.equalsIgnoreCase(this.nia)){
            this.nia = nia;
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.fechaNacimiento = fechaNacimiento;
            this.grupo = grupo;
            return true;
        }
        System.out.println("Alumno con NIA ya existente");
        return false;
    }

    private boolean borrar(String nia){
        if (nia.equalsIgnoreCase(this.nia)){

        }

    }

    public String getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    /*
    * Mostrar Alumno
    */
    @Override
    public String toString() {
        return "Alumno{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", grupo=" + grupo +
                '}';
    }
}
