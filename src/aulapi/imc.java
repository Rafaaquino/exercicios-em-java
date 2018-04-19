/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author rafael.eraquino
 */
public class imc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double a, p, m;

        System.out.print("Digite seu peso  ");
        p = leitor.nextDouble();
        System.out.print("Digite seu Altura  ");
        a = leitor.nextDouble();

        m = a / (p * p);

        if (m < 26) {

            System.out.print("Seu peso está normal ta liberado pra comer lanche ");

        } else if ((m >= 26) && (m < 30)) {

            System.out.print("Você está acima do peso  ");

        } else {
            System.out.println("Você está com obesidade morbida  ");

        }

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
