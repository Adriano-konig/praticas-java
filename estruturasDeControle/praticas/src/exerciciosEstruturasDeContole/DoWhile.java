package exerciciosEstruturasDeContole;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("você precisa falar nas palavras mágicas...");
            System.out.println("Quer sair? ");
            texto = teclado.nextLine();
        } while(!texto.equalsIgnoreCase("Por favor"));

//        String valor = "";
//
//    do{
//        System.out.println("você diz: ");
//        valor = teclado.nextLine();
//    } while (!valor.equalsIgnoreCase("sair"));

        System.out.println("Obrigado!!");
        teclado.close();
    }
}
