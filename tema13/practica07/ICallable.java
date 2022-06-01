package com.programacionOO.tema13.practica07;

import java.util.concurrent.Callable;

public interface ICallable extends Callable {
    void onFound();
    void onFinished();
}
