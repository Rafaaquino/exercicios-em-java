
package lista4;

import java.util.Scanner;

/**
 * Dado um vetor​ de números inteiros e um número inteiro, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado.

 *
 * @author Rafael
 */
public class Exe7 {
    public static void main(String[] args) {
        int dados = recebeDados();
        int mult = recebeDados();
        int[] vetor = criaVetor(dados);
        vetor = preencheVetor(vetor);
        int resultado = multiVetor(vetor, mult);
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
                System.out.printf("\n numero invalido \n digite novamente \n");
            }
        }while(saiLoop);
        return dados;
    }
    
    static int [] criaVetor(int dados){
        int[] vetor = new int[dados];        
        return vetor;
    }
    
    static int[] preencheVetor(int[] vetor){
        int dados = 0;
        for(int i = 0; i<vetor.length; i++){
            dados = recebeDados();
            vetor[i] = dados;
        }
        return vetor;
    }
    
    static int multiVetor(int[] vetor, int mult){
        int resultado = 0;
        
        for(int i = 0; i<vetor.length; i++){
            
            resultado = resultado + (vetor[i] * mult);
        }
        
        return resultado;
    }
    
    static void imprimi(int resultado){
        System.out.println("o resultado é: "+resultado);
    }
    
}
