package fundamentos.conversao;

import java.util.Scanner;

public class RespostaProfessorDesafioConversao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe primeiro salario: ");
        String valor1 = teclado.next().replace(",", ".");
        System.out.println("Informe segundo salario: ");
        String valor2 = teclado.next().replace(",", "."); //replace == substituição
        System.out.println("Informe terceiro salario: ");
        String valor3 = teclado.next().replace("," , ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double somaTotalSalario = salario1 + salario2 + salario3;
        double mediaSalario = somaTotalSalario / 3;

        System.out.println("Média salario é: " + mediaSalario);

        teclado.close();
    }
}
