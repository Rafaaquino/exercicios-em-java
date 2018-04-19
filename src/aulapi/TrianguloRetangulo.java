
package exerciciopi;

import java.util.Scanner;

/**
 *
 * @author Rafael Aquino
 */
public class TrianguloRetangulo {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        int catA, catO, r, A, O, S;
        
        System.out.print("Digite o valor de cateto Adiacente: ");
        catA = leitor.nextInt();
        
        System.out.print("Digite o valor de cateto Oposto: ");
        catO = leitor.nextInt();
        
        //preocessamento
        
        A =  (int) Math.pow(catA,2);
        
        O =  (int) Math.pow(catO,2);
        
        S = A+O;
        
        r = (int) Math.sqrt(S);
        
        
        System.out.println("O valor da Hipotenusa é:  "+r);
    }
}
