
package lista4;

import java.util.Scanner;

/**
 * Dado um vetor​ de números inteiros, fazer um programa que imprima o produto dos elementos do vetor.
 *
 * @author Rafael
 */
public class Exe6 {
    public static void main(String[] args) {
        int dados = recebeDados();
        int[] vetor = vetor(dados);
        vetor = preencheVetor(vetor);
        imprimiVetor(vetor);
    }
    
    static int recebeDados(){
        Scanner leitor = new Scanner(System.in);
        boolean saiLoop = true;
        int dados = 0;
        
        do{
            try{
                System.out.print("Digite um numero: ");
                dados = Integer.parseInt(leitor.next());
                saiLoop = false;
                
            }catch(Exception ex){
                System.out.printf("\n número invalido \n digite novamente! \n");
            }
        }while(saiLoop);
        
        return dados;
    }
    
    static int[] vetor(int dados){
        int[] vetor = new int[dados];
        return vetor;
    }
    
    static int[] preencheVetor(int[] vetor){
        int dados = 0;
        for(int i=0; i<vetor.length; i++){
            
            dados = recebeDados();
            vetor[i] = dados;
        }
        return vetor;
    }
    
    static void imprimiVetor(int[] vetor){
        for(int i = 0; i<vetor.length; i++){
            System.out.printf("posição [%d]: %d \n", i , vetor[i]);
        }
    }
}
