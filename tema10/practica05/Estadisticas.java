package com.programacionOO.tema10.practica05;


import com.github.javafaker.Faker;
import com.programacionOO.libs.Util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Estadisticas {
    private ArrayList<Paciente> pacientes;

    public Estadisticas(int numPacientes) {
        pacientes = new ArrayList<>(numPacientes);
        if (Config.DEBUG){
            genData(numPacientes);
        }
    }

    private void genData(int numPacientes){
        Faker f = new Faker(new Locale("ES"));
        Paciente p1 ;
        String nombre ;
        int anyo;
        int mes;
        int dia;
        char sexo = 'm';
        int s = 0;
        float peso = 45f, altura = 1.7f;
        GregorianCalendar fechaNac;

        for (int i = 0; i < numPacientes; i++) {
            anyo = Util.random(1992,2017);
            mes = Util.random(0,12) ;
            dia = Util.random(1,28);
            fechaNac = new GregorianCalendar(anyo,mes, dia);

            nombre = f.name().firstName();
            peso = Util.randomFloat(45.5f,100);;
            altura = Util.randomFloat(1.5f,2);
            s = Util.random(0,1);
            sexo = (s == 1) ? 'f': 'm';

            p1 = new Paciente(nombre, fechaNac,sexo,peso, altura);
            pacientes.add(p1);

        }
        System.out.println(toString());
    }

    int[] majorMenor(ArrayList<Paciente> imputData){
        //todo : [0] el paciente de menor edad ,[1] el paciente de mayor edad
        int[] data = new int[2];
        int edadMajor = Integer.MIN_VALUE, edadMenor = Integer.MAX_VALUE;

        for (Paciente paciente: imputData) {
            if (paciente.getEdad() > edadMajor){
                edadMajor = paciente.getEdad();
            }
            if (paciente.getEdad() < edadMenor){
                edadMenor = paciente.getEdad();
            }
        }
        data[0] = edadMenor;
        data[1] = edadMajor;
        return data;

    }
    int[] pacientsPerSexe(ArrayList<Paciente> imputData){
        //todo : [0] cantidad pacientes Mascle(hombre) ,[1] cantidad pacientes Femella(mujer)
        int[] data = new int[2];
        int contM = 0, contF =0;

        for (int i = 0; i < imputData.size(); i++) {
            if (imputData.get(i).getSexo() == 'm'|| imputData.get(i).getSexo() == 'M'){
                contM++;
            }else if (imputData.get(i).getSexo() == 'f'|| imputData.get(i).getSexo() == 'F'){
                contF++;
            }
        }
        data[0] = contM;
        data[1] = contF;
        return data;
    }
    public double calcularIMC(float altura, float peso){
        //todo : calcular IMC = peso / (altura * altura)
        return peso / (altura * altura);
    }
    public static int calcularEdad(Calendar fechaNac) {
//        LocalDate ld = new LocalDate();
        Calendar fechaActual = Calendar.getInstance();
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        if(months < 0 // Aún no es el mes de su cumpleaños
                || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return years;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    @Override
    public String toString() {
        return pacientes + "";
    }
}



















