package jogodaadvinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {

    public static void main(String[] args) {
        Random a = new Random();
        int ale = a.nextInt(10);
        Scanner ler = new Scanner(System.in);
        int c, d;
        String p;
        System.out.print("Digite o seu nome: ");
        p = ler.nextLine();
        System.out.println("Gostaria de iniciar o jogo " + p + "?Digite 1 para continuar ou 2 para sair");
        d = ler.nextInt();
        switch (d) {
            
            case 2:
                if (d == 2) {
                    System.out.println("Muito bem, saindo!");
                }
        
                break;
                
            case 1:
                for (int i = 0;i!=ale;i++){
                if (d == 1) {
                    System.out.println("Muito bem, vamos lá!!");
                }
                do {
                    System.out.print("Digite um número: ");
                    c = ler.nextInt();
                    if (c > ale) {
                        System.out.println("O número secreto é menor, tente de novo");
                    } else if (c < ale) {
                        System.out.println("O número secreto é maior, tente de novo");
                    } else if (c == ale) {
                        System.out.println("Você acertou " + p + " , parabéns!!!");
                    }
               
                } while (c != ale);
                System.out.println(i);
                 break;
                
                    
               
        }
        }
    }
}