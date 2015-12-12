package bol2.pkg6;
import java.util.Scanner;
/**
 *
 * @author manu
 */
public class Bol26 {
    public static void main(String[] args) {
        float pt,pp;
        Scanner porcentaxe= new Scanner(System.in);
        System.out.println("pt");
        pt=porcentaxe.nextFloat();
        System.out.println("pp");
        pp=porcentaxe.nextFloat();
        System.out.println("porcentaxe="+((pt-pp)*100)/pt+"%");
    }
    
}
