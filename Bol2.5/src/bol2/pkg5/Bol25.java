
package bol2.pkg5;

import java.util.Scanner;

public class Bol25 {

    public static void main(String[] args) {
       float millas, cte= 1852;
       Scanner obj = new Scanner (System.in);
       System.out.println ("Teclea las millas:");
       millas = obj.nextFloat();
       System.out.println ("Conversion a metros:" +((millas*cte)/1000) + "Km");
    }
    
}
