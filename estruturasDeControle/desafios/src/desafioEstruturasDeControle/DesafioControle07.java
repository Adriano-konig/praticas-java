package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle07 {

    public static void main(String[] args) {

        //7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a
        // soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.

        Scanner teclado = new Scanner(System.in);

        int numerosPositivo = 0;
        int num = 0;

        System.out.println("Numero positivo vão somando até escolhe um numero negativo vai parar a programa");
        while (num >= 0){
            System.out.println("Numero: ");
            num = teclado.nextInt();
            System.out.println("Numero inserido: "+ num);
            numerosPositivo += num;
        }
            numerosPositivo -= num;
            System.out.println(numerosPositivo);

    }
}
