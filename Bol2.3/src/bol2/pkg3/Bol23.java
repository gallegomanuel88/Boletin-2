
package bol2.pkg3;

import java.util.Scanner;

public class Bol23 {

    public static void main(String[] args) {
        float euros, vdolar = 1.1162f ;
        Scanner obj = new Scanner (System.in);
        System.out.println ("teclea Euros");
        euros = obj.nextFloat();
        System.out.println ("Resultado="+ euros*vdolar+"$");
    }
    
}
