package exerciciosEstruturasDeContole;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner teclado =  new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = teclado.nextLine();
        }

        teclado.close();
    }
}
