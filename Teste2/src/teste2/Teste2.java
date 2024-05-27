/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

import java.util.Scanner;

/**
 *
 * @author aluno.saolucas
 */
public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int a;
        int b = 10;
       for (int i = 0;i!=10;i++){
        do{
            
            
        System.out.println("Digite um número");
        a = ler.nextInt();  
            
            
            
        }while(a!=b);
          
       }
    }
}
