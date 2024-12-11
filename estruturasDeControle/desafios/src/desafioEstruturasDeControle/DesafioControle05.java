package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle05 {

    public static void main(String[] args) {

        //5. Refatorar o exercício 04, utilizando a estrutura switch.

        Scanner teclado = new Scanner(System.in);

        int numDivisores = 0;
        String conceito = "";

        System.out.println("Informe um numero e vai imprimir para saber se esse numero e primo ou não: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numDivisores++;
            }
        }

        switch (numDivisores) {
            case 1:
                conceito = "É primo";
                break;
            default:
                conceito = "Não é primo";
                break;
        }
        System.out.printf("Numero %d: %s ", num, conceito);

    }
}
