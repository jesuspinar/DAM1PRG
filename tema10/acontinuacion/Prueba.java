package com.programacionOO.tema10.acontinuacion;

import com.programacionOO.libs.Util;
import com.programacionOO.tema10.practica10.Config.Config;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Prueba {
    SimpleDateFormat sdf;
    GregorianCalendar fechaNac;

    public Prueba() {

        int year = 0,month = 0, day = 0;
        sdf = new SimpleDateFormat("dd/MM/yyyy");

        year = Util.askInteger("El año en el que nacio" , Config.MIN_YEAR,Config.MAX_YEAR);
        month = Util.askInteger("El mes en el que nacio" , Config.MIN_MONTH,Config.MAX_MONTH);
        day = Util.askInteger("El day en el que nacio" ,Config.MIN_DAY,Config.MAX_DAY);
        fechaNac = new GregorianCalendar(year,month-1,day);

        System.out.println("Naciste el dia : ");
        System.out.println(sdf.format(fechaNac.getTime()));

        long nacInMilis = fechaNac.getTimeInMillis();
        double unMes = 2629743833.33;
        long result = nacInMilis - ((long) unMes * 9);
        fechaNac.setTimeInMillis(result);

        System.out.println("Te concivieron aproximadamente el :");
        System.out.println(sdf.format(fechaNac.getTime()));

    }
}
