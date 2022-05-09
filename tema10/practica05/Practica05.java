package com.programacionOO.tema10.practica05;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Practica05 {
    Estadisticas est ;
    public Practica05(int numPacientes) {
        est = new Estadisticas(numPacientes);
        imprimirTabla(numPacientes);
        imprimirEstadisticas(numPacientes);
    }

    public void imcMensaje(double indice){
        if (indice < 18.5) System.out.println("Peso insuficiente");
        else if (indice >= 18.5 || indice <= 24.9 ) System.out.println("Peso normal");
        else if (indice >= 25 || indice <= 26.9 ) System.out.println("Sobrepeso grado I");
        else if (indice >= 27 || indice <= 29.9 ) System.out.println("Sobrepeso grado II");
        else if (indice > 29.9) System.out.println("Sobrepeso grado III");
    }
    private void imprimirEstadisticas(int numPacientes){
        int[] majorMenor = est.majorMenor(est.getPacientes());
        int[] perSexe = est.pacientsPerSexe(est.getPacientes());

        System.out.printf("\n\nPACIENTE MANOR EDAD: %d",majorMenor[0]);
        System.out.printf("\nPACIENTE MAYOR EDAD: %d",majorMenor[1]);
        System.out.printf("\nCantidad de pacientes por sexos:\nHombres : %d   Mujeres : %d\n\n", perSexe[0],perSexe[1]);

        for (int i = 0; i < est.getPacientes().size(); i++) {
            System.out.printf("Paciente numero %d : ",(i+1));
            imcMensaje(est.calcularIMC(est.getPacientes().get(i).getAltura(),
                        est.getPacientes().get(i).getPeso()));
        }
    }

    private void imprimirTabla(int numPacientes){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String space = "";
        int id;
        char sexo;
        float peso;
        float altura;
        String nombre;
        GregorianCalendar fechaNac;
        int edad;
        System.out.printf("%s%18s%6s%6s%8s","id","Fecha Nacimiento","Sexo","Peso","Altura");
        for (int i = 0; i < est.getPacientes().size(); i++) {
            id = est.getPacientes().get(i).getId();
            sexo = est.getPacientes().get(i).getSexo();
            peso = est.getPacientes().get(i).getPeso();
            altura = est.getPacientes().get(i).getAltura();
            nombre = est.getPacientes().get(i).getNombre();
            fechaNac = est.getPacientes().get(i).getFechaNac();
            edad = est.getPacientes().get(i).getEdad();

            System.out.printf("\n%s%16s%8s%3s%.1f%3s%.2f",id,
                    String.format("%10s", sdf.format(fechaNac.getTime())),
                    sexo,space,peso,space,altura);
        }
    }

}


