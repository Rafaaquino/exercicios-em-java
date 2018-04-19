
package lista4;

import java.util.Scanner;

/**
 * Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.

 *
 * @author Rafael
 */
public class Exe2 {
    public static void main(String[] args) {
        
        int dados = recebeDados();
        double[] vetor = vetor(dados);
        vetor = preenchevetor(vetor);
        double soma  = soma(vetor);
        imprimiSoma(soma);
                
        
    }
    
    static int recebeDados(){
        Scanner leitor = new Scanner(System.in);
        boolean saiLoop = true;
        int dados = 0;
        
        do{
            try{    
                System.out.print("digite um valor: ");
                dados = Integer.parseInt(leitor.next());
                
                saiLoop = false;
            }catch(Exception ex){
                System.out.printf("\n Número invalido! \n Digite novamente");
            }
         }while(saiLoop);
        return dados;
    }
    
    static double[] vetor(int dados){
        
        double[] vetor = new double[dados];        
        
        return vetor;
    }
    
    static double[] preenchevetor(double[] vetor){
        double a = 0;
        for(int i=0; i<vetor.length; i++ ){
            System.out.println("Dados preenchidos");
            a = recebeDados();
            
            vetor[i] = a;
        }
        
        return vetor;
    }
    
    static double soma(double[] vetor){
        double soma = 0;
        for(int i = 0; i<vetor.length; i++){
            
            soma = soma + vetor[i];
        }
        
        return soma;
    }
    
    static void imprimiSoma(double soma){
        System.out.println("soma do vetor: "+soma);
            
        
    }
    
    
}
