package fundamentos.calculador;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // Ler qual operação usauario quer fazer para calcular + - * / %
        //sem usar condição if else..


        Scanner teclado = new Scanner(System.in);


        System.out.println("********************");
        System.out.println("********************");
        System.out.println("***  CALCULADORA ***");
        System.out.println("********************");
        System.out.println("********************");

        System.out.println("Olá, por gentileza escolhe primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.println("Escolhe segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.println("Qual operação desejar fazer calcauler?: ");
        String operacao = teclado.next();

        //Lógica
        int resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;


        System.out.printf("%d %s %d = %d",
                num1, operacao, num2, resultado );

        teclado.close();



    }
}
