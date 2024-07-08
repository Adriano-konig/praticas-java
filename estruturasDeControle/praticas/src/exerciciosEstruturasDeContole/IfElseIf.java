package exerciciosEstruturasDeContole;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota: ");
        double nota = teclado.nextDouble();

        if(nota < 0 || nota > 10){
            System.out.println("Nota que você digitado é inválido");
            System.out.println("Fim");
            }
        else if(nota >= 8.1){
            System.out.println("Conceito A");
            System.out.println("Parabéns");
        } else if (nota >= 6.1) {
            System.out.println("Condição B");
        } else if (nota >= 4.1) {
            System.out.println("Condição C");
        } else if (nota >= 2.1) {
            System.out.println("Condição D");
        } else{
            System.out.println("Condição E");
        }
        System.out.println("Fim");
        teclado.close();
    }
}
