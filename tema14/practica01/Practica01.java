package com.programacionOO.tema14.practica01;

import java.io.*;
import java.net.*;

/**
 * Crea un programa que, utilizando la clase Socket, se conecte a la URL
 * y puerto indicados como parámetro al invocar la aplicación y muestre
 * el código html de la página.
 */

public class Practica01 {
    private Socket socket;
    private static final int MILIS = 19_000;
    private String host ;
    private int port ;

    public Practica01(String host, int port) {
        this.host = host;
        this.port = port;
        //Openning a new connection
        openConnection();
        //Getting and printing data
        try {
            socket.setSoTimeout(MILIS);
            retriveData();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        //Closing the door
        closeConnection();
    }

    private boolean openConnection(){
        try {
            socket = new Socket(host, port);
            if (socket.isConnected()){
                System.out.println("Connected : " + InetAddress.getByName(host));

            }else {
                System.out.println("Failed connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    private boolean retriveData(){
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
        ){
            //depende del navegador el servido puede aplicar optimizaviones de respuesta
            //Realizamos las peticiones necesarias desde el stream de salida
            pw.println("GET /index.html HTTP/1.1");
//            pw.println("User-Agent: Mozilla/4.0 (compatible; MSIE5.01; Windows NT)");
            pw.println("Host: www." + host); //si no se pone el host se confunde
            pw.println("Connection: close");
            pw.println();
            String ln;
            while((ln = bufferedReader.readLine()) != null){
                System.out.println(ln);
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private boolean closeConnection(){
        try {
            socket.close();
            System.out.println("Disconnected : " + InetAddress.getByName(host));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}