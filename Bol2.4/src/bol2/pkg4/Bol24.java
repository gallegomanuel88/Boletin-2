package bol2.pkg4;

import java.util.Scanner;

public class Bol24 {

    public static void main(String[] args) {
        float num1, num2;
        Scanner obj = new Scanner (System.in);
        System.out.println ("Teclea el primer numero:");
        num1 = obj.nextFloat();
        System.out.println ("Teclea el segundo numero:");
        num2 = obj.nextFloat();
        System.out.println ("Resultado suma:" +(num1+num2));
        System.out.println ("Resultado resta:" +(num1-num2));
        System.out.println ("Resultado multiplicación:" +(num1*num2));
        System.out.println ("Resultado división:" +(num1/num2));
        
    }
    
}
