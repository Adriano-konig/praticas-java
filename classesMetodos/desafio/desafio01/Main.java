package desafio01;

public class Main {

    public static void main(String[] args) {

        Data dt1 = new Data();
        dt1.dia = 12;
        dt1.mes = 04;
        dt1.ano = 2000;

        Data dt2 = new Data();
        dt2.dia = 30;
        dt2.mes = 01;
        dt2.ano = 1999;

        Data dt3 = new Data();
        dt3.dia = 20;
        dt3.mes = 12;
        dt3.ano = 2020;


        System.out.println("Data numero 1: " + dt1.dia + "/" + dt1.mes + "/" + dt1.ano);
        System.out.println("Data numero 2: " + dt2.dia + "/" + dt2.mes + "/" + dt2.ano);
        System.out.println("Data numero 3: " + dt3.dia + "/" + dt3.mes + "/" + dt3.ano);


    }
}
