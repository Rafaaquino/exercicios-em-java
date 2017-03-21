
package aulapi;

import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class aula3 {

    
    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        
        //ENTRADAS
        System.out.print("x1: ");
        double x1 = leitor.nextLine();
        System.out.print("x2: ");
        double x2 = leitor.nextLine();
        System.out.print("c: ");
        double c = leitor.nextLine();
        
        
        //PROCESSAMENTO
        
        double s = x1 + x2;
        double p = x1*x2;
        double a = c / p;
        double b = -(a * s);        
        
        //SAIDA
        
        System.out.println(a+ "x² + " +b+ " x +" +c + " = 0 ");
        
    }
    
}
