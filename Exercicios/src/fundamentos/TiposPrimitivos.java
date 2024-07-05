package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // informação do funcionario

        //Tipos numériso inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;


        // Tipo caractere
        char status = 'A'; //Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);


        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Ponto de real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        // Salarios
        System.out.println(id + ": Seu salario será -> " + salario);

        //Ferias
        System.out.println("Esta férias?: " + estaDeFerias);

        //Status
        System.out.println("Status: " + status);



    }
}
