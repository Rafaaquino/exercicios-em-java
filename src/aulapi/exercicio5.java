
package exercicio;

import java.util.Scanner;


public class exercicio5 {
    public static void main(String []args){
    
    Scanner leitor = new Scanner(System.in);
    
    int n1, r;
    
    System.out.println("Fazer um algoritmo que leia um valor A e calcula a área de um quadrado de lado A");
    
    System.out.print("Digite um valor:  ");
    n1 = leitor.nextInt();
    
    r = n1*n1;
    
    System.out.println("Resultado: "+r+"m²");
    
    
    }
}
