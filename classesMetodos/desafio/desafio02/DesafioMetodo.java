package desafio02;

public class DesafioMetodo {

    public static void main(String[] args) {

        var data1 = new DataObjeto();
        data1.dia = 14;
        data1.mes = 10;
        data1.ano = 2024;

        //Desafio que eu fiz
        var dataHoje = data1.obterDataFormatada();

        System.out.println(dataHoje);


        //Resposta Professor

        System.out.println(data1.obterDataFormataRespProfessor());


    }
}
