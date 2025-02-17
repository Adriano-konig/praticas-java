package encapsulamento.gettersEsetters;

public class PessoasTeste {

    public static void main(String[] args) {

        Pessoas p1 = new Pessoas("Pedro","Amoedo",45);
//        p1.idade = -30;  //alterar
        p1.setIdade(-20);

        System.out.println(p1.getIdade());// ler
        System.out.println(p1); //toString
    }
}
