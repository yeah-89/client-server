package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket ss = new ServerSocket(3000);
        Socket s = ss.accept();
        System.out.println("connessione riuscita");

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            String str= in.readLine();
            if(str.equals("EXIT")){
                break;
            }
            out.println("Risposta: " + str.toUpperCase());
        }

        System.out.println("Disconnesso");
    }
}