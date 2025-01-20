package desafio03;

public class DesafioConstrutor {

    public static void main(String[] args) {

        Data dataInicial = new Data();
        System.out.println("Data inicial: " + dataInicial.dia + "/" + dataInicial.mes + "/" + dataInicial.ano);

        Data data1 = new Data(1,1,1970);
        System.out.println(data1.formataData(data1.dia, data1.mes, data1.ano));
    }
}
