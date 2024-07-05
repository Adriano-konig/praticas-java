package fundamentos.operadores;

import fundamentos.faculdade.Administracao.Matricula;

public class DesafioAritmeticos {

    public static void main(String[] args) {

        int a = (6*6) * (5*5) / 6;

        int b = (-4 * -4) * (-5 * -5) / (2 * 2);

        int resultado = (a - b) * (a -b) * (a - b) / (10*10*10);

        System.out.println(resultado);

    }
}
