
package lista4;

import java.util.Scanner;

/**
 * Dado um vetor​ de números inteiros, fazer um programa que imprima a média dos elementos do vetor.

 *
 * @author Rafael
 */
public class Exe5 {
    public static void main(String[] args) {
       int dados = recebeDados();
       int[] vetor = vetor(dados);
       vetor = preencheVetor(vetor);
       int resultado = mediaVetor(vetor);
        imprimi(resultado);
    }
    
    static int recebeDados(){
        Scanner leitor = new Scanner(System.in);
        int dados = 0;
        boolean saiLoop = true;
        
        do{
            try{
                System.out.print("Digite um numero: ");
                dados = Integer.parseInt(leitor.next());
                
                saiLoop = false;
                
            }catch(Exception ex){
                System.out.printf("\n número invalido! \n Digite novamente! \n");
            }
        }while(saiLoop);
        
        return dados;
    }
    
    static int[] vetor(int dados){
        int[] vetor = new int[dados];
        
        return vetor;
    }
    
    static int[] preencheVetor(int[] vetor){
        for(int i = 0; i<vetor.length; i ++){
            
           int dados = recebeDados();
           vetor[i] = dados; 
        }
        
        return vetor;
    }
    
    static int mediaVetor(int[] vetor){
        int media = vetor[0];
        int soma = 0;
        for(int i = 0; i < vetor.length; i++){
            
            if(media > 0){
                
               soma = media + vetor[i];
               
               media = soma / 2;
            }
        }
        
       return media;        
    }
    
    static void imprimi(int resultado){
        System.out.println("A media é: " + resultado);
    }
}

