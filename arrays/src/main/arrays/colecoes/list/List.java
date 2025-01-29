package colecoes.list;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u = new Usuario("Ana");
        lista.add(u);

        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("joão"));
        lista.add(new Usuario("Bruno"));

        System.out.println(lista.get(3)); //Acesso pelo indíce.

        System.out.println(">> REMOVIDO << " + lista.remove(1)); //aqui apareceu meu nome é Pedro mas e essa que foi removido;
        System.out.println(lista.remove(new Usuario("joão")));

        System.out.println("Tem?" + lista.contains(new Usuario("Pedro")));
        System.out.println("Tem?" + lista.contains(new Usuario("Ana")));

        for (Usuario usuario: lista){
            System.out.println(usuario.nome);
            //System.out.println(usuario); //Aqui vai mostra mensagem tds meu nome é ...;
        }


    }
}
