package exerciciosEstruturasDeContole;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Informe a media: ");
        double media = teclado.nextDouble();

        boolean aprovado = media < 10 && media >= 7.0;
        boolean recuperacao = media >= 4.5 && media < 7.0;
        boolean reprovado = media < 4.5 && media >= 0;

        if(aprovado)
            System.out.println("Aprovado");

        if(recuperacao)
            System.out.println("Recuperação");

        if(reprovado)
            System.out.println("Reprovado");
    }
}
