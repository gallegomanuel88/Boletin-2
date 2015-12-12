
package bol2.pkg9;
import java.util.Scanner;
/**
 *
 * @author manu
 */
public class Bol29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int €, c, v, i, s, C, V, I;
        Scanner obx1 = new Scanner (System.in);
        System.out.println("introduzca la cantidada de billetes de 100€");
        c = obx1.nextInt();
        C=c*100;
        Scanner obx2 = new Scanner (System.in);
        System.out.println("introduzca la cantidad de billetes de 20€");
        v = obx2.nextInt();
        V=v*20;
        Scanner obx3 = new Scanner (System.in);
        System.out.println("introduzca la cantidad de billetes de 5€");
        i = obx3.nextInt();
        I=i*5;
        Scanner obx4 = new Scanner (System.in);
        System.out.println("introduzca la cantidad de monedas de 1€");
        s = obx4.nextInt();
        System.out.println("dinero total ="+ (C + V + I + s) +"€");
    }
    
}
