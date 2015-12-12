package bol2.pkg2;

import java.util.Scanner;

public class Bol22 {

    public static void main(String[] args) {
        float lado;
        int n= 2;
        Scanner obj = new Scanner (System.in);
        System.out.println ("teclea lado");
        lado = obj.nextFloat();
        int resultado = (int) Math.pow(lado, n);
        System.out.println ("area=" +resultado );
    }
    
}
