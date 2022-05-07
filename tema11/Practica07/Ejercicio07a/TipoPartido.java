package com.programacionOO.tema11.Practica07.Ejercicio07a;

import com.germangascon.tema11.utils.Lib;

public enum TipoPartido {
    BAJA_AFLUENCIA, MEDIA_AFLUENCIA, ALTA_AFLUENCIA;

    /**
     * Genera un TipoPartido aleatorio
     * @return
     */
    public static TipoPartido random() {
        return TipoPartido.values()[Lib.aleatorio(0, TipoPartido.values().length-1)];
    }
}
