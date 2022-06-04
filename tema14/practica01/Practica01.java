package com.programacionOO.tema14.practica01;

import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Crea un programa que, utilizando la clase Socket, se conecte a la URL
 * y puerto indicados como parámetro al invocar la aplicación y muestre
 * el código html de la página.
 */

public class Practica01 {
    private Socket socket;
    private static final int MILIS = 19_000;

    public Practica01(String uri, int port) {
        //Openning a new connection
        try {
            socket = new Socket(uri, port);
            if (socket.isConnected()){
                System.out.println("Connected : " + InetAddress.getByName(uri));

            }else {
                System.out.println("Failed connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Getting and printing data
        try {
            socket.setSoTimeout(MILIS);
            retriveData();
        } catch (SocketException e) {
            e.printStackTrace();
        }

        //Closing the door
        try {
            socket.close();
            System.out.println("Disconnected : " + InetAddress.getByName(uri));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private boolean retriveData(){
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        ){
            System.out.println("Getting info...");
            String ln;
            while ((ln = bufferedReader.readLine()) != null) {
                System.out.println(ln);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}