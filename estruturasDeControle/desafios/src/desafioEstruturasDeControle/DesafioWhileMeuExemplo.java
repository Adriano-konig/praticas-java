package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioWhileMeuExemplo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int aluno = 0;
        double nota = 0;
        double total = 0;


        while(aluno <= 1){
            System.out.println("Informe nota: ");
            nota = teclado.nextDouble();

            if(nota < 0 || nota > 10){
                System.out.println("inválido");
                System.out.println("Fim");
                teclado.close();
            }else{
                total+=nota;
                aluno++;
            }
        }
        double resultado = total / aluno;
        System.out.println("resultado: " + resultado);
        teclado.close();
    }
}
