public class ValorNulo {

    public static void main(String[] args) {

        String s1 = "";
        System.out.println(s1.concat("!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null; // executar 3 vezes vai aparece o terminal
        if (d1 != null){
            d1.mes = 03;
            System.out.println(d1.formataData());
        }
//        String s2 = null;
//        System.out.println(s2.concat("???")); //vai da erro
        String s3 = Math.random() > 0.5 ? "opa" : null; // executar 3 vezes vai aparece o terminal
        if (s3 != null){
            System.out.println(s3.concat("???"));
        }
    }
}
