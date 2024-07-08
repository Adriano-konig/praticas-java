package fundamentos.conversao;

import javax.swing.*;
import java.util.Locale;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String salario1 = JOptionPane.showInputDialog("Digite Primeiro salario: ");
        String salario2 = JOptionPane.showInputDialog("Digite Segundo salario: ");
        String salario3 = JOptionPane.showInputDialog("Digite Terceiro salario: ");

        System.out.println("salario1 + salario2 + salario3:" + salario1 + salario2 + salario3);

        double salarioPrimeiro = Double.parseDouble(salario1);
        double salariosegundo = Double.parseDouble(salario2);
        double salarioTerceiro = Double.parseDouble(salario3);

        double somaTotalSalario = salarioPrimeiro + salariosegundo + salarioTerceiro;
        double mediaSalario = somaTotalSalario / 3;

        System.out.println("Média salario é: " + mediaSalario);

    }
}
