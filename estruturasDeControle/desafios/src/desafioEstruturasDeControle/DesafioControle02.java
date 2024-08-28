package desafioEstruturasDeControle;

public class DesafioControle02 {

    //2. Criar um programa informa se o ano atual é um ano bissexto;
    public static void main(String[] args) {

        int ano = 32;

        if((ano % 4) == 0 && (ano%100)!=0){
            System.out.println("Ano atual é bissexto");
        }else {
            System.out.println("Ano atual não é bissexto");
        }


    }
}
