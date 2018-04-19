
package exercicios;

import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class IfElse {
    public static void main(String []args){
        Scanner leitor = new Scanner(System.in);
        
        int n1, r;
        
        System.out.print("Digite um número  ");
        n1 = leitor.nextInt();
        
        if(n1>100){
            r = n1 + 150;
            System.out.println("seu numero é "+r);
            
        } else {System.out.println("seu numero é menor que 100");}
        
        
        
    }
}
