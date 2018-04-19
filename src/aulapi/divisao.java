
package exercicios;
    import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class divisao {

   public static void main(String []args){
        Scanner leitor = new Scanner(System.in);
        
        float n1, n2, r;
        
        System.out.print("Digite um número  ");
        n1 = leitor.nextInt();
        System.out.print("Digite outro número  ");
        n2 = leitor.nextInt();
        
        r = n1 % n2;
        
        if (r == 0 ){
        
            System.out.println("Divisão exata");
        } else {
            
            System.out.println("Divisão não exata");
        }
    }

}
