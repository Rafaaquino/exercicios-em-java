
import java.util.Scanner;
/**
 *
 * @author rafael.eraquino
 */
public class MediaPonderada {

    /*
     * @param args
     */
    public static void main(String args[]){
        
        Scanner leitor = new Scanner(System.in);
        
        float nota1, nota2, media;
        float prova1, prova2;
        
        prova1 = 0.4f;
        prova2 = 0.6f;
        
        System.out.println("Calculo da média do Aluno");
        System.out.print("Digite a nota 1:  ");
        
        nota1 = leitor.nextFloat();
        
        System.out.print("Digite a nota 2:  ");
        
        nota2 = leitor.nextFloat();
        
        media = (nota1 * prova1) + (nota2 * prova2);
        
        System.out.println("Média do Aluno: " + media);
    }
}
