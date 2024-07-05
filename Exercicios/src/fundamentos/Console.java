package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom");
        System.out.println(" dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d", 2, 4, 54, 44, 32, 12);

        System.out.printf("\nSalaraio: %.1f%n", 1234.5678);
        System.out.printf("Salaraio: %.2f%n", 1234.5678);
        System.out.printf("Salaraio: %.3f%n", 1234.5678);
        System.out.printf("\nNome: %s%n", "joão");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é seu nome?: ");
        String nome = entrada.nextLine();

        System.out.println("Idade?: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.printf("%s tem %d anos.%n",nome,idade);

        entrada.close();


    }
}
