package bol2.pkg11y12;
import java.util.Scanner;
/**
 *
 * @author manu
 */
public class Bol211y12 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // TODO code application logic here
        float sueldoF=0f,porVentas=0f,sueldoFinal=0f;
        int kmHechos,diasDesp;
        System.out.println("Introducir sueldo fijo");
        sueldoF=teclado.nextFloat();
        System.out.println("Introducir el total de ventas");
        porVentas=teclado.nextFloat();
        System.out.println("Introducir los km recorridos");
        kmHechos=teclado.nextInt();
        System.out.println("Introducir dias de desplazamiento");
        diasDesp=teclado.nextInt();
        porVentas=porVentas*0.05f;
        kmHechos=kmHechos*2;
        diasDesp=diasDesp*30;
        sueldoFinal=sueldoF+porVentas+kmHechos+diasDesp;
        float sueldoRecibido=0f;
        sueldoRecibido=(float) (sueldoFinal-36-(sueldoFinal*0.18));
        System.out.println("El salario a recibir es "+sueldoRecibido+" €");
    }
    
}
