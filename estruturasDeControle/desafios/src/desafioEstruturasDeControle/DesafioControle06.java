package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle06 {

    public static void main(String[] args) {

        //6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        // Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas
        // para adivinhar o número gerado.
        // Ao final de cada tentativa, imprima a
        // quantidade de tentativas restantes, e imprima se o número inserido é maior
        // ou menor do que o número armazenado.

        Scanner teclado = new Scanner(System.in);
        int numAdivinha = 0;
        int armezena = 300;
        int tentativa = 10;
        int total =0;
        int i = 1;

        System.out.println("Vamos brincar de numero Adivinhação? Digite um numero entre 0 a 100" +
                "+ você tem 10 tentativa");

        for (i = 1; i <= tentativa; i++) {
            int descrescenteNumeroTentativa = 11 - i;
            System.out.printf("Você tem %d tentativa: ", descrescenteNumeroTentativa);
            numAdivinha = teclado.nextInt();

            if (numAdivinha > 0 && numAdivinha <= 100 ){
                total += numAdivinha;
            }else {
                System.out.println("Numero que vc escolheu esta fora entre 0 a 100");
            }
        }

            if (armezena < total){
                System.out.printf("Armazenamento = %d Numero adivinhação = %d ",armezena,total);
                System.out.println("Numero Armazenamento é menor que numero inserido");
            }else {
                System.out.printf("Armazenamento = %d Numero adivinhação = %d ",armezena,total);
                System.out.println("Numero Armazenamento é maior que numero inserido");
            }

        System.out.println("Fim de jogo");
    }
}
