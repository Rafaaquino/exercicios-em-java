
package exerciciopi;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Salario2 {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        double Salario, hora, valor, nivel;
        
        
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        
        System.out.print("Digite seu nivel: ");
        nivel = leitor.nextDouble();
        
        System.out.print("Digite o valor da sua hora trabalhada: ");
        valor = leitor.nextDouble();
        
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        hora = leitor.nextDouble();
        
             
        if (nivel == 1){
            
            valor = + 15;
            
        }else if (nivel == 2){
            
            valor = + 18;
            
        }else if (nivel ==3){
           
            valor = + 22;
        }else if (nivel == 4){
            
            valor = + 27;
            
        }else if (nivel == 5){
            
            valor = + 33;
        }
        
        //PROCESSAMENTO
        
        Salario = valor*hora;
        
        System.out.printf("O funcionário %s  trabalhou %.2f Horas e o Valor da Hora é %.2f , o nivel dele é %.1f \n e deve receber R$ %.2f\n", nome, hora, nivel, valor, Salario );
        
        
    }
}
