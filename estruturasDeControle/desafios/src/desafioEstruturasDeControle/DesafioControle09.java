package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle09 {

    public static void main(String[] args) {

        //9. Crie um programa que recebe 10 valores e ao final imprima o maior número.

        int numero = 1;
        int numeroMaior = 0;
        int numeroDigitado = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " Escolhe um valor: ");
            numeroDigitado = teclado.nextInt();

            if(numero != 0){
                numero = numeroDigitado;
                if (numero > numeroMaior){
                    numeroMaior = numero;
                }
            }

        }
        System.out.println("Numero maior que você adicionou foi: " + numeroMaior);
    }
}
