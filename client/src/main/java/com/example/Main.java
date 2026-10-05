package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Hello world!");
        Socket s = new Socket("127.0.0.1", 3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        Scanner scan= new Scanner(System.in);

        while (true) {

            System.out.println("Inserisci una stringa: ");
            String text = scan.nextLine();
            out.println(text);
            if(text.equals("EXIT")){
                break;
            }
            System.out.println(in.readLine());
        }
        scan.close();
        System.out.println("Disconnesso");
    }
}