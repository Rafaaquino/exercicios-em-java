
package lista4;

import java.util.Scanner;

/**
 * Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número
está presente no vetor.

 *
 * @author Rafael 
 */

public class Exe8 {
    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int dados = recebeDados();
        int dadosVerifica = recebeDadosVerifica();
        int[] vetor = criaVetor(dados);
        vetor = preencheVetor(vetor);
        verifica(vetor, dadosVerifica);
    }
    
    static int recebeDados(){
        int dados = 0;
        boolean saiLoop = true;
        
        do{
            try{
                System.out.print("Digite o tamanho do vetor: ");
                dados = Integer.parseInt(leitor.next());
                saiLoop = false;
            }catch(Exception ex){
                System.out.printf("\n numero invalido \n digite novamente \n");
            }
        }while(saiLoop);       
        
        return dados;
    }
    
    static int recebeDadosVerifica(){
        int dadosVerifica = 0;
        boolean saiLoop = true;
        
        do{
            try{
                System.out.print("Digite um numero: ");
                dadosVerifica = Integer.parseInt(leitor.next());
                saiLoop = false;
            }catch(Exception ex){
                System.out.printf("\n numero invalido \n digite novamente \n");
            }
        }while(saiLoop);       
        
        return dadosVerifica;
    }
    
    static int[] criaVetor(int dados){
        int[] vetor = new int[dados];        
        return vetor;
    }
    
    static int[] preencheVetor(int[] vetor){
        int dados = 0;
        boolean saiLoop = true;
        for(int i =0; i<vetor.length; i++){
            
            do{
                try{
                    System.out.print("Digite os valores do vetor: ");
                    dados = Integer.parseInt(leitor.next());
                    vetor[i] = dados;
                    saiLoop = false;
                    
                }catch(Exception ex){
                    System.out.printf("\n numero invalido \n digite novamente \n");                   
                }
            }while(saiLoop);
        }
        
        return vetor;
    }
    
    static void verifica(int[] vetor, int dadosVerifica){
        int resultado = 0;
        
        for(int i =0; i<vetor.length; i++){
            if(dadosVerifica == vetor[i]){
                
                resultado = dadosVerifica;
                System.out.printf("A posição vetor[%d]: possuie o numero %d \n", i, vetor[i]);
            }
            else{
                System.out.printf("A posição vetor[%d]: Não possuie o numero \n", i);
            }
            
        }
        
    }
    
    
}
