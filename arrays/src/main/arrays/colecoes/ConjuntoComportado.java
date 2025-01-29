package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> listaAprovado = new HashSet<>();
        SortedSet<String> listaAprovado = new TreeSet<>(); //SortedSet, TreeSet => Ordem letras
        listaAprovado.add("Ana");
        listaAprovado.add("Rodrigo");
        listaAprovado.add("Bruno");
        listaAprovado.add("Carlos");

        for (String nomeAprovados: listaAprovado){
            System.out.println("Lista Aprovados: " + nomeAprovados);
        }

        System.out.println();

//        Set<Integer> listaNumero = new HashSet<>();
        Set<Integer> listaNumero = new TreeSet<>(); //Ordem numeros de lista
        listaNumero.add(1);
        listaNumero.add(20);
        listaNumero.add(3);
        listaNumero.add(2);
        listaNumero.add(4);

        //listaNumero.get(1); //Não é possivel acessar pelo índice.
        for (int n: listaNumero){
            System.out.println("Lista numeros: " + n);
        }
    }
}
