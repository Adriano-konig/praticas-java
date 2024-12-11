package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioControle08 {

    public static void main(String[] args) {

        //8. Criar um programa que receba uma palavra e imprime no console letra por letra.

        String palavra = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        palavra = teclado.nextLine();

       for (int i = 0; i < palavra.length(); ++i){
           char letra = palavra.charAt(i);
           System.out.println(letra);
       }
    }
}
