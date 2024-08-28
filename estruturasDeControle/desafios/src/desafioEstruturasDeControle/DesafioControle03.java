package desafioEstruturasDeControle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioControle03 {

    public static void main(String[] args) {
        /*3. Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno
 for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que
  4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("#############################");
        System.out.println("#############################");
        System.out.println("            NOTAS            ");
        System.out.println("#############################");
        System.out.println("#############################");

        String resultado = "";

        System.out.print("Nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = teclado.nextDouble();

        double soma = nota1 + nota2;
        double media = soma / 2;

      if(media >= 7.0 && media <= 10.0){
          System.out.printf("garantiu a média %.1f você está Aprovado!!", media);
      }else if(media > 4.0 && media < 7.0){
          System.out.printf("Garantiu a média %.1f você esta em Recuperação", media);
      } else if (media >= 0 && media < 4.0) {
          System.out.printf("Garantiu a média %.1f você está Reprovado!! :(", media);
      }else {
          System.out.println("Mal formato digito ou nota não esta dentro entre 0 a 10");
      }
    }
}
