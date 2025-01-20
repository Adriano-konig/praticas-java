package desafio03.desafioRespostaProfessor;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 20;

        System.out.println(d1.dia + "/" + d1.mes + "/" + d1.ano);
        d1.formatadaTeste();

        Data d2 = new Data(30, 06, 2025);

        System.out.println(d2.formatada());
        d2.formatadaTeste();
    }
}
