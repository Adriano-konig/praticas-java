package desafio;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {

        //Desafio professor quer que o usario informar a quantidade elementos
        // e usario informar as notas e armezar as notas e calcular a media.

        Scanner teclado = new Scanner(System.in);

        System.out.print("informe quantidade notas: ");
        int qtdade = teclado.nextInt();

        double[] notas = new double[qtdade];


        double notatotal = 0.0;
        for (int i = 1; i <= notas.length; i++){
            System.out.printf("Informe nota %d: ",i);
            double nota = teclado.nextDouble();
            notatotal += nota;
        }

        double media =  notatotal / 4;
        System.out.println("Media: " + media);


    }
}
