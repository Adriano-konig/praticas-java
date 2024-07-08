package fundamentos.calculador;

import java.util.Scanner;

public class DesafioCalculadoDouble {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe numero: ");
        double num1 = teclado.nextDouble();

        System.out.println("Informe numero: ");
        double num2 = teclado.nextDouble();

        System.out.println("Qual operação: ");
        String op = teclado.next();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("Resultado: %.2f %s %.2f = %.2f", num1, op, num2, resultado);

        teclado.close();
    }
}
