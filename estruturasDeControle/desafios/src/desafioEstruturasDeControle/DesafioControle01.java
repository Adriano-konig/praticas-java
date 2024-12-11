package desafioEstruturasDeControle;

public class DesafioControle01 {

    //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0){
                System.out.printf("i = %d é Par\n", i);
            }
        }
    }
}
