package fundamentos.calculador;

import java.util.Scanner;

public class DesafioCalculadoraFloat {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe numero: ");
        float num1 = teclado.nextFloat();

        System.out.println("Informe numero: ");
        float num2 = teclado.nextFloat();

        System.out.println("Qual operação: ");
        String op = teclado.next();

        float resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("Resultado: %f %s %f = %f", num1, op, num2, resultado);
        teclado.close();
    }
}
