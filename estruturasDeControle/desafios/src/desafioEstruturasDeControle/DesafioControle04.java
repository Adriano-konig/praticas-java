package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle04 {

    public static void main(String[] args) {
        /* 4. Criar um programa que receba um número e diga se ele é um número primo.  */

        Scanner teclado = new Scanner(System.in);
        int numPrimo;
        int numDivisores = 0;

        System.out.println("Digite um numero que desejar para seber se numero é primo ou não: ");
        numPrimo = teclado.nextInt();

        for (int i = 1; i <= numPrimo; i++) {
            if(numPrimo % i == 0){
                numDivisores++;
            }
        }

        if(numDivisores == 2){
            System.out.println("Numero é primo " + numDivisores);
        }else {
            System.out.println("Numero não é primo " + numDivisores);
        }
    }
}
