package desafioEstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {
        //Crie um condição o usuário digitar um numero vai imprimir qual é dia de semana.
        // Domingo => 1
        // Segunda => 2
        // Terça => 3
        // ...

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe qual é dia semana hoje? ");
        String semana = teclado.next();

        if("domingo".equalsIgnoreCase(semana)){
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(semana)) {
            System.out.println(2);
        }  else if ("terça".equalsIgnoreCase(semana) || "terca".equalsIgnoreCase(semana)) {
            System.out.println(3);
        }  else if ("quarta".equalsIgnoreCase(semana)) {
            System.out.println(4);
        }  else if ("quinta".equalsIgnoreCase(semana)) {
            System.out.println(5);
        }  else if ("sexta".equalsIgnoreCase(semana)) {
            System.out.println(6);
        }  else if ("sabado".equalsIgnoreCase(semana) || "sábado".equalsIgnoreCase(semana) ) {
            System.out.println(7);
        } else {
            System.out.println("Informção não está dia de semana!!");
        }
        System.out.println("Fim");
        teclado.close();

//        if(semana > 7 || semana < 1){
//            System.out.println("Esse numero é inválido!! Por favor informe numero 1 a 7");
//        } else if (semana == 1) {
//            System.out.println("Domingo");
//        } else if (semana == 2) {
//            System.out.println("Segunda-feira");
//        } else if (semana == 3) {
//            System.out.println("Terça-feira");
//        } else if (semana == 4) {
//            System.out.println("Quarta-feira");
//        } else if (semana == 5) {
//            System.out.println("Quinta-feira");
//        } else if (semana == 6) {
//            System.out.println("Sexta-feira");
//        } else {
//            System.out.println("Sabado");
//        }
//        System.out.println("Fim");
//        teclado.close();

    }
}
