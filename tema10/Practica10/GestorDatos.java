package com.programacionOO.tema10.Practica10;

import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;
import com.programacionOO.tema10.Practica10.Config.Config;
import com.programacionOO.tema10.Practica10.employExceptions.NotEmployeException;
import com.programacionOO.tema10.anexoIterator.MyRandom;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GestorDatos {
    private final ArrayList<Empleado> empleados; //final la variable del puntero al array no puede cambiar

    public GestorDatos() {this(10);}

    public GestorDatos(int initalCapacity) {
        empleados = new ArrayList<>(initalCapacity);
        if (Config.DEBUG == true) generateData(initalCapacity);
    }

    public boolean nuevoEmpleado() throws NotEmployeException {
        String nombre = Util.askStringRestricted("Introduzca su nombre",Config.MIN_NAME,Config.MAX_NAME);
        String apellido = Util.askStringRestricted("Introduzca su apellido",Config.MIN_NAME,Config.MAX_NAME);
        float sueldo = (float) Util.askInteger2("Cuanto quiere ganar?" , Config.MIN_SUELDO,Config.MAX_SUELDO);
        String nif;
        do {
            nif = Util.askStringRestricted("Introduzca su nif ",9,9);
        }while (!Util.validarDNI(nif));

        GregorianCalendar fechaNac;
        int year = 0,month = 0, day = 0;

        year = Util.askInteger2("El año en el que nacio" , Config.MIN_YEAR,Config.MAX_YEAR);
        month = Util.askInteger2("El mes en el que nacio" , Config.MIN_MONTH,Config.MAX_MONTH);
        day = Util.askInteger2("El day en el que nacio" ,Config.MIN_DAY,Config.MAX_DAY);
        fechaNac = new GregorianCalendar(year,month,day);

        Empleado empleado = new Empleado(nif,nombre,apellido,fechaNac,sueldo);
        empleados.add(empleado);

        return true;
    }
    public boolean nuevoHijo() throws NotEmployeException {
        int id = Util.askInteger("Intruzca su id empleado:");
        if (busquedaEmpleado(id)){
            String nombre = Util.askStringRestricted("Introduzca el nombre de su hijo",Config.MIN_NAME,Config.MAX_NAME);
            String apellido = empleados.get(id).getApellidos();

            GregorianCalendar fechaNac;
            int year = 0,month = 0, day = 0;

            year = Util.askInteger2("El año en el que nacio" , Config.MIN_YEAR,Config.MAX_YEAR);
            month = Util.askInteger2("El mes en el que nacio" , Config.MIN_MONTH,Config.MAX_MONTH);
            day = Util.askInteger2("El day en el que nacio" ,Config.MIN_DAY,Config.MAX_DAY);
            fechaNac = new GregorianCalendar(year,month,day);

            return empleados.get(busquedaPosicion(id)).addHijo(nombre,apellido,fechaNac);
        }
        return false;
    }
    public boolean modificarSueldo() throws NotEmployeException {
        int idEmpleado = Util.askInteger("Intruzca su id empleado:");
        if (busquedaEmpleado(idEmpleado)){
            float sueldoNuevo = Util.askInteger2("Cuanto desea ganar?",Config.MIN_SUELDO, Config.MAX_SUELDO);
            return empleados.get(busquedaPosicion(idEmpleado)).modifySueldo(sueldoNuevo);
        }
        return false;
    }
    public boolean borrarEmpleado() throws NotEmployeException {
        Empleado empleado;
        int idEmpleado = Util.askInteger("Intruzca su id empleado:");
        if (busquedaEmpleado(idEmpleado)){
            System.out.println("Se dispone a borrar dicho empleado esta seguro?");
            int option = Util.askInteger("1.-Borrar\n0.-Exit");
            if (option == 0){return false;}
            else {
                empleados.remove(busquedaPosicion(idEmpleado));
                return true;
            }
        }
        return false;
    }
    public boolean borrarHijo() throws NotEmployeException {
        int idEmpleado = Util.askInteger("Intruzca su id empleado:");
        if (busquedaEmpleado(idEmpleado)){
            System.out.println(empleados.get(idEmpleado).mostrarHijos());
            int idHijo = Util.askInteger("Intruzca su id de su Hijo:");

            System.out.println("Se dispone a borrar hijo del empleado esta seguro?");
            int option = Util.askInteger("1.-Borrar\n0.-Exit");
            if (option == 0){return false;}
            else {
                empleados.get(busquedaPosicion(idEmpleado)).removeHijo(idHijo);
                return true;
            }
        }
        return false;
    }
    /* BUSQUEDAS DEL SISTEMA ...*/

    /**
     * Busca al empleado por su id, usado internamente
     * @param id
     * @return la posicion en el arraylist
     * @throws NotEmployeException
     */
    private int busquedaPosicion(int id) throws NotEmployeException {
        for (Empleado i : empleados ) {
            if (id == i.getId()){
                return empleados.indexOf(i);
            }
        }
        throw new NotEmployeException("No esta registrado como empleado");
    }

    public boolean busquedaEmpleado(int id) throws NotEmployeException {
        // todo : metodo iterator para busquedas globales
        for (Empleado i : empleados ) {
            if (id == i.getId()){
                return true;
            }
        }
        throw new NotEmployeException("No esta registrado como empleado");
    }
    public Empleado busquedaEmpleado(String nif) throws NotEmployeException {
        for (Empleado i : empleados ) {
            if (nif.equalsIgnoreCase(i.getNif())){
                return i;
            }
        }
        throw new NotEmployeException("No esta registrado como empleado");
    }
    public ArrayList<Empleado> busquedaNombres(String nombre) throws NotEmployeException {
        ArrayList<Empleado> r = new ArrayList<>();
        if (nombre != null){
            for (Empleado empleado : empleados ) {
                if (nombre.equalsIgnoreCase(empleado.getNombre())){
                    r.add(empleado);
                }
            }
            return r;
        }
        throw new NotEmployeException("No esta registrado como empleado");
    }

    public ArrayList<Empleado> busquedaEdad(int min,int max) {
        ArrayList<Empleado> r = new ArrayList<>();
        for (Empleado empleado : empleados ) {
            if (empleado.getEdad() >= min && empleado.getEdad()  <= max) {
                r.add(empleado);
            }
        }
        return r;
    }
    public ArrayList<Empleado> busquedaSueldo(int min,int max) {
        ArrayList<Empleado> r = new ArrayList<>();
        for (Empleado empleado : empleados ) {
            if (empleado.getSueldo() >= min && empleado.getSueldo()  <= max) {
                r.add(empleado);
            }
        }
        return r;
    }
    public boolean mostrarHijosMenores(){
        for (Empleado empleado: empleados) {
            empleado.mostrarMenoresEdad();
        }
        return true;
    }

    private boolean generateData(int intial){

        Faker faker = new Faker(new Locale("ES"));
        int nif;
        String nombre;
        String apellidos;
        float sueldo;
        GregorianCalendar fechaNac;
        int year = 0,month = 0, day = 0;
        Empleado empleado ;
        MyRandom pull  = new MyRandom(empleados.size(),Config.MAX_DNI,Config.MIN_DNI);

        for (int i = 0; i < intial; i++) {
            nif = pull.next();
            nombre = faker.name().firstName();
            apellidos = faker.name().lastName();
            sueldo = Util.randomFloat(Config.MIN_SUELDO,Config.MAX_SUELDO);
            year = Util.random(Config.MIN_YEAR,Config.MAX_YEAR);
            month = Util.random(Config.MIN_MONTH,Config.MAX_MONTH);
            day = Util.random(Config.MIN_DAY,Config.MAX_DAY);
            fechaNac = new GregorianCalendar(year,month,day);
            empleado = new Empleado(nif +"Z",nombre,apellidos,fechaNac,sueldo);
            System.out.println(empleado);
            empleados.add(empleado);
        }
        return true;

    }

}
