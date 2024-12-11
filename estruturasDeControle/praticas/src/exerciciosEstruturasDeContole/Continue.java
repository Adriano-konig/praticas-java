package exerciciosEstruturasDeContole;

public class Continue {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }

        for(int i = 0; i < 10; i++){     // "Continue" não para a programa mas vai pular numero 5 e continuar programa
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("FIM");
    }
}
