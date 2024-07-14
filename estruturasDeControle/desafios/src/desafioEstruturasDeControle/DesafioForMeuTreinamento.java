package desafioEstruturasDeControle;

public class DesafioForMeuTreinamento {

    public static void main(String[] args) {

//        //Criar uma cartaz de loteria Mega sena
//        for(int i = 1; i <= 60; i++){
//            System.out.printf("[%d]",i);
//            if(i == 10){
//                System.out.println("\n");
//            } else if (i == 20) {
//                System.out.println("\n");
//            } else if (i == 30) {
//                System.out.println("\n");
//            } else if (i == 40) {
//                System.out.println("\n");
//            } else if (i == 50) {
//                System.out.println("\n");
//            }
//        }

//        //Criar uma tabuada de 2
//        for (int i = 2; i < 3; i ++){
//            for (int j = 0; j <= 10; j ++){
//                int multiplicador = i * j;
//                System.out.printf("%d * %d = %d\n",i,j,multiplicador);
//            }
//        }

//        //Crie uma ordem descende 30 a 0
//        for(int i = 30; i >= 0; i--){
//            System.out.println(i);
//        }

        //Crie uma ordem crescente cada 5 (0 a 50)
        for(int i = 0; i<=50; i+=5){
            System.out.println(i);
        }
    }
}
