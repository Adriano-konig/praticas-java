package desafio;

import java.util.Scanner;

public class desafioArrayRespostaProf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Quantas notas: ");

        int qtdadeNotas = entrada.nextInt();

        double[] notas = new double[qtdadeNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("A média é " + media + "!");
        entrada.close();





    }
}
