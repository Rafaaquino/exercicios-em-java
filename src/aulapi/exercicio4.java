
package exercicio;

import java.util.Scanner;


public class exercicio4 {
    public static void main(String []args){
        
        Scanner leitor = new Scanner(System.in);
        
        int n1, n2, r;
        
        System.out.println("Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.");
        
        System.out.print("Digite número:  ");
        n1 = leitor.nextInt();
        System.out.print("Digite número:  ");
        n2 = leitor.nextInt();
        
        
       if (n1 < 0){System.out.println(n1 -1);}
       
       else  {System.out.println(n1 +1);}
       
       if (n2 < 0){System.out.println(n2 -1);}
       
       else  {System.out.println(n2 +1);}
    }
}
