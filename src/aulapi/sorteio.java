
package aulapi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class sorteio {
    public static void main(String []args){
    
    Scanner leitor = new Scanner(System.in);
    
    Random rng = new Random();
    
    int sorteado = rng.nextInt(10);
    
    System.out.println(sorteado);   
    
    
    
    }
}
