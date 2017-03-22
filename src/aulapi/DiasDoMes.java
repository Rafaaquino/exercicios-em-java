
package aulapi;

import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class DiasDoMes {
    public static void main(String []args){
        Scanner leitor = new Scanner(System.in);
        
        
        int dias;
        
        System.out.print("Digite o mês:  ");
        int mes = leitor.nextInt();
        
               
        if (mes ==1 || mes ==3 || mes ==5 || mes ==7 || mes ==8 || mes== 10 || mes ==12){
        
        dias = 31;
        
        } else if (mes ==2){
        
        dias = 28;
        
        }      
        else{ dias =30;
        
        
        }
          
        
        System.out.println("Dias: "+dias);
                
    }
}
