
package exercicio;

import java.util.Scanner;


public class exercicio3 {
    public static void main(String []args){
        Scanner leitor = new Scanner(System.in);
        
        float n1,n2,r;
        
        System.out.println("Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números");
        
        System.out.print("Digite um número: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite outro numero: ");
        n2 = leitor.nextFloat();
        
        r = (n1*n1)+(n2*n2);
        
        System.out.println("Resultado:  "+r);
        
    }
}
