package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        c = "Outro texto";
        System.out.println(c);

        double d; // variável foi declarada               se for tipo var substituir o lugar double com essa forma não vai declarar!
        d = 123.655; // variável foi inicializada
        System.out.println(d); // usada!

        var e = 123.45;
        System.out.println(e);



    }
}
