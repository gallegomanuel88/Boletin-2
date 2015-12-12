package bol2.pkg8;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Bol28 {
    
    public static void main(String[] args) {
     float centigrados;
     Scanner obj = new Scanner (System.in);
     System.out.println ("Teclea centigrados");
     centigrados = obj.nextFloat();
     System.out.println (centigrados + " centigrados son: " + (centigrados+273) + " kelvin y " + 32+(1.8*centigrados) + " farenheit");
    }
    
}
