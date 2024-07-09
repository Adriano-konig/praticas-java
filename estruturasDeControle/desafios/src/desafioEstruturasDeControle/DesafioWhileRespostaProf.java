package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioWhileRespostaProf {
    public static void main(String[] args) {

        Scanner teclado  = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.print("Informe nota (ou -1 para sair): ");
            nota = teclado.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                quantidadeDeNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválido :(");
            }

        }

        //calcular média
        double media = total / quantidadeDeNotas;
        System.out.println("Média é: " + media);

        teclado.close();
    }
}
