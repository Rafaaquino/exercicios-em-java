
package exerciciopi;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class AutomnomiaCarro {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        float km, l, r;
        
        System.out.print("Quantos litros de gasolina gastou:  ");        
        l = leitor.nextFloat();
        
        System.out.print("Quantos KM foi a viagem:  ");
        km = leitor.nextFloat();
        
        r = km/l;
        
        System.out.println("Sua media de KM por litro é de:  "+r);
        
    }
    
    
}
