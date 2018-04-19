
package exerciciopi;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class PerimetroTriangulo {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        int A, O, C = 5, r;
        
        System.out.print("Digita o valor de Cateto A do Triangulo: ");
        A = leitor.nextInt();
        
        System.out.print("Digita o valor de Cateto O do Triangulo: ");
        O = leitor.nextInt();
       
        //processamento
        
        r = A+O+C;
        
        //Saida
        System.out.printf("Operimetro do triangulo é %d m² \n",r);
        
    }
}
