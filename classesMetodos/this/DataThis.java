public class DataThis {

    int dia;
    int mes;
    int ano;

    DataThis(){
//        dia = 2;
//        mes = 2;
//        ano = 1970;
        this(2, 2, 1970); //THIS()
    }

    DataThis(int dia, int mes, int ano){
        this.dia = dia; //THIS
        this.mes = mes; //THIS
        this.ano = ano; //THIS
    }

    String formataData(){
        return String.format("%d/%d/%d", this.dia, mes, ano);
    }
}
