
package exercicio;

import java.util.Scanner;


public class exercicio6 {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        double a,b,c,r;
        
        System.out.println("Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:" );
        System.out.println("a) a área do triângulo retângulo que tem A por base e C por altura. ");
        System.out.print("Digite o valor de A:  "); 
        a = leitor.nextDouble();
        
        System.out.print("Digite o valor de B:  ");
        b = leitor.nextDouble();
        
        r = (a*b)/2;
    
        System.out.print("Resposta:  "+r);
    
    }
}
