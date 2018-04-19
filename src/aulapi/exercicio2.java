
package exercicios;
import java.util.Scanner;
/**
 *
 * @author rafael.eraquino
 */
public class exercicio2 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        
        
        double n1,n2,r;
        
        System.out.println("Fazer um algoritmo que lê dois números, e imprime a potência");
        
        System.out.print("Digite um número: ");
        n1 = leitor.nextDouble();
        System.out.print("Digite outro número ");
        n2 = leitor.nextDouble();
        
        r = Math.pow(n1,n2);
        
        System.out.print("O resultado é: ");
        System.out.println(r);
    }
}
