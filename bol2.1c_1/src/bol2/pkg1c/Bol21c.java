package bol2.pkg1c;

import java.util.Scanner;

public class Bol21c {

    public static void main(String[] args) {
        //entrada por teclado
        float base, altura;
        Scanner obj = new Scanner (System.in);
        System.out.println ("teclea base");
        base = obj.nextFloat();
        System.out.println (System.getProperty ("line.separator"));
        System.out.println ("teclea altura");
        altura = obj.nextFloat();
        System.out.println ("area="+ base*altura/2);
    }
    
}
