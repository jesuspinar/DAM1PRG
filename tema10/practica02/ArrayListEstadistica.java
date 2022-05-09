package com.programacionOO.tema10.practica02;

import java.util.ArrayList;

public class ArrayListEstadistica extends ArrayList<Double> implements IEstadisticas{

    //this se refiere al constructor de la clase objeto ArrayListEstidisticas
    @Override
    public double minimo() throws NumberFormatException{
        if (this == null){
            throw new NullPointerException("ArrayList received is set to null");
        }
        double min = this.get(0);
        for (int i = 1; i < this.size(); i++) {
            if (get(i) < min){
                min = get(i);
            }
        }

        return min;
    }

    @Override
    public double maximo() throws NumberFormatException{
        if (this == null){
            throw new NullPointerException("ArrayList received is set to null");
        }
        double max = get(0);
        for (int i = 1; i < size(); i++) {
            if (get(i) > max){
                max = get(i);
            }
        }

        return max;
    }

    @Override
    public double sumatorio() throws NumberFormatException{
        if (this == null){
            throw new NullPointerException("ArrayList received is set to null");
        }
        double sum = get(0);
        for (int i = 1; i < size(); i++) {
            sum += get(i);
        }

        return sum;
    }

    @Override
    public double media() {
        return sumatorio() / size();
    }
    //todo volver hacer con Hashmap , clave == value , reps == valor

    /**
     * obtiene valor actual y mira cuantas veces se repite
     * @return double
     * @throws NumberFormatException
     */
    @Override
    public double moda() throws NumberFormatException {
        if (this == null){
            throw new NullPointerException("ArrayList received is set to null");
        }
        double value = get(0);
        int reps = 0 ;
        for (int i = 0; i < size(); i++) {
            double currentValue = get(i);
            int currentApparition = 1;
            for (int j = 0; j < i; j++) {
                if (currentValue == get(j)){
                    currentApparition++;
                }
            }
            if (currentApparition > reps){
                reps = currentApparition;
                value = currentValue;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [");
        for (double x:
             this) {
            sb.append(x).append(" ");
        }
        sb.append("]\n");
        sb.append("Minimo: ").append(minimo()).append("\n");
        sb.append("Maximo: ").append(maximo()).append("\n");
        sb.append("Sumatorio: ").append(sumatorio()).append("\n");
        sb.append("Media: ").append(media()).append("\n");
        sb.append("Moda: ").append(moda()).append("\n");
        return sb.toString();
    }
}
