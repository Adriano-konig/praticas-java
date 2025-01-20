package desafio03.desafioRespostaProfessor;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 3;
        ano = 2024;
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String formatada(){
        return dia + "/" + mes + "/" + ano;
    }

    void formatadaTeste(){
        System.out.println(formatada());
    }


}
