package fundamentos.conversao;

public class ConversaoDeTiposPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1;  //Implicita
        System.out.println(a);

        float b = (float) 1.12345678888888888; //Explícita (Cast)
        System.out.println(b);

        int c = 130;        //Explícita (Cast)
        byte d = (byte) c;
        System.out.println(d);  // Só consegue ate 127

        int e = 127;            //Explícita (Cast)
        byte f = (byte) e;
        System.out.println(f);

        double g = 1.9999999;             //Explícita (Cast)
        int h = (int) g;          // Double converteu para int  1.99999 -> 1
        System.out.println(h);



    }
}
