package colecoes.hash;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Ana"));
        usuarios.add(new Usuario("Bruno"));

        //Faz teste coloque comentario de metodo HasCode o resultado vai mudar
        boolean resultado = usuarios.contains(new Usuario("Bruno"));
        System.out.println(resultado);
    }
}
