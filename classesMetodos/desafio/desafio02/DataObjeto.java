package desafio02;

public class DataObjeto {

    int dia;
    int mes;
    int ano;

    //Desafio que eu fiz
    String  obterDataFormatada(){
        var data = dia + "/" + mes + "/" + ano;
        return data;
    }

    //Resposta Professor:

    String obterDataFormataRespProfessor(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
