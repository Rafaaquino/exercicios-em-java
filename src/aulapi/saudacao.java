
package aulapi;

import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class saudacao {
    public static void main(String []args){
    
    Scanner leitor = new Scanner(System.in);
    
    System.out.print("nome: ");
    String nome = leitor.nextLine();
    
    if (nome == ""){
        System.out.println("Olá, Mundo!");
    
    } else {
        System.out.println("Olá, " + nome + "!" );
    
    }
        
    }
}
