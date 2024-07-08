package fundamentos.operadores;

public class DesafioLogico {
    public static void main(String[] args) {
        //Trabalho na Terça (V ou F)
        //Trabalho na Quinta (V ou F)

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //Operador Unário !
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV 50\"? " + comprouTv50);
        System.out.println("Comprou TV 32\"? " + comprouTv32);
        System.out.println("Comprou Sorvete\"? " + comprouSorvete);

        //Operador Unário!
        System.out.println("Mais saudavel?" + maisSaudavel);

    }
}
