package exerciciosEstruturasDeContole;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o numero: ");

        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }
    }
}
