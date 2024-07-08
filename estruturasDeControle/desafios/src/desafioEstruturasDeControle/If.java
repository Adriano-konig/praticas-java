package desafioEstruturasDeControle;

public class If {
    public static void main(String[] args) {
        //Desafio

        double nota = 1.3;
//Essa resultado imprimiu como fosse aprovado mas não era para ser então professor deu desafio para encontrar onde esta o erro!!
//        if(nota >= 9.0); {
//            System.out.println("Quadro de Honra!");
//            System.out.println("Você é fera");
//        }
        // Não usar ; em estruturas de controles (tem um exceção)

        if (nota >= 9.0) {
            System.out.println("Quadro de Honra");
            System.out.println("Você é fera");
        }
    }
}
