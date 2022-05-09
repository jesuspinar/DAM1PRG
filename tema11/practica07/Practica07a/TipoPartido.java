package com.programacionOO.tema11.practica07.Practica07a;


import com.programacionOO.libs.Util;

public enum TipoPartido {
    BAJA_AFLUENCIA, MEDIA_AFLUENCIA, ALTA_AFLUENCIA;

    /**
     * Genera un TipoPartido aleatorio
     * @return
     */
    public static TipoPartido random() {
        return TipoPartido.values()[Util.random(0, TipoPartido.values().length - 1)];
    }
}
