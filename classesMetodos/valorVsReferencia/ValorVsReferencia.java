
public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuiçãop por valor (Tipo primitivo).

        a++;
        b--;

        System.out.println(a + " " + b);

        DataThis d1 = new DataThis(1, 6, 2022);
        DataThis d2 =  d1; // atribuição por referência (Objeto).

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.formataData());
        System.out.println(d2.formataData());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.formataData());
        System.out.println(d2.formataData());

        int c = 5;
        valorPrimitivo(c);
        System.out.println(c);

    }

    static void voltarDataParaValorPadrao(DataThis d) {

        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void valorPrimitivo(int a){
        a++;
    }
}
