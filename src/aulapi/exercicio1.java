/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

    
/*
 *
 * @author rafael.eraquino
 */
    public class exercicio1 {
       public static void main(String [] args){

        Scanner leitor = new Scanner(System.in);
        
        float n1,n2,r;
        
        System.out.println("Fazer um algoritmo que leia dois números e imprima o produto dos dois");
         
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextFloat();
        
        r = n1*n2;
                
        System.out.print("O Produto do resultado é: ");
        System.out.println(r);
        


        
    }
}
