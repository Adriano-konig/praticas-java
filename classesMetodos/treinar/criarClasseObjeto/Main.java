package criarClasseObjeto;

public class Main {

    public static void main(String[] args) {

        Esportes e1 = new Esportes();
        e1.tipoesporte = "Futebol";
        e1.nomeAtleta = "Adriano";
        e1.idade = 27;
        e1.titulo = 5;

        var e2 = new Esportes();
        e2.tipoesporte = "Volei de praia";
        e2.nomeAtleta = "Paulo";
        e2.idade = 30;
        e2.titulo = 20;

        System.out.println("#######################################################");
        System.out.println("################     ESPORTE     ######################");
        System.out.println("#######################################################");

        System.out.println("\nLISTA DOS ATLETAS:: ");
        System.out.println("\nTipo esporte: " + e1.tipoesporte);
        System.out.println("NOME ATLETA: " + e1.nomeAtleta);
        System.out.println("IDADE: " + e1.idade);
        System.out.println("TITULOS: " + e1.titulo);

        System.out.println("\nTipo esporte: " + e2.tipoesporte);
        System.out.println("NOME ATLETA: " + e2.nomeAtleta);
        System.out.println("IDADE: " + e2.idade);
        System.out.println("TITULOS: " + e2.titulo);

    }
}
