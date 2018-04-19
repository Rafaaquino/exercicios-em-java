
package exerciciopi;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Salario {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        double Salario, hora, valor, R;
        
        
        System.out.print("Digite seu nome: ");
        nome = leitor.next();
        System.out.print("Digite o valor da sua hora trabalhada: ");
        valor = leitor.nextDouble();
        
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        hora = leitor.nextDouble();
        
        //PROCESSAMENTO
        
        Salario = valor*hora;
        
        System.out.printf("O funcionário %s  trabalhou %.2f Horas e o Valor da Hora é %.2f , \n e deve receber R$ %.2f\n", nome, hora, valor, Salario );
        
        
    }
}
