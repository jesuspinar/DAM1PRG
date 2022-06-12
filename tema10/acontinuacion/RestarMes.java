package com.programacionOO.tema10.acontinuacion;

import com.programacionOO.libs.Util;
import com.programacionOO.tema10.practica10.Config.Config;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class RestarMes {
    SimpleDateFormat sdf;
    GregorianCalendar fechaAct;
    GregorianCalendar compareFecha;

    public RestarMes() {

        int year = 0, month = 0, day = 0;
        int compareYear = 0, compareMonth = 0, compareDay = 0;
        sdf = new SimpleDateFormat("dd/MM/yyyy");

        year = Util.askInteger("Año", Config.MIN_YEAR, Config.MAX_YEAR);
        month = Util.askInteger("Mes", Config.MIN_MONTH, Config.MAX_MONTH);
        day = Util.askInteger("Dia", Config.MIN_DAY, Config.MAX_DAY);
        fechaAct = new GregorianCalendar(year, month - 1, day);

        compareYear = Util.askInteger("Año a restar", Config.MIN_YEAR, Config.MAX_YEAR);
        compareMonth = Util.askInteger("Mes a restar", Config.MIN_MONTH, Config.MAX_MONTH);
        compareDay = Util.askInteger("Dia a restar", Config.MIN_DAY, Config.MAX_DAY);
        compareFecha = new GregorianCalendar(compareYear, compareMonth - 1, compareDay);

        System.out.println("Fecha introducida");
        System.out.println(sdf.format(fechaAct.getTime()));

        long actInMilis = fechaAct.getTimeInMillis();
        long compareInMilis = compareFecha.getTimeInMillis();
        long result = actInMilis - compareInMilis;
        fechaAct.setTimeInMillis(result);

        sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Han pasado ");
        System.out.println(sdf.format(fechaAct.getTime()));
    }
}
