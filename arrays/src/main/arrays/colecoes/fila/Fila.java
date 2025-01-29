package colecoes.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Offer e Add -> adiciona elementos na fila
        //Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // lançara uma exceção caso a fila esteja cheia.
        fila.offer("Bia"); // retorna falso caso a fila esteja cheia.
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Obter o próximo elemetos da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        System.out.println();

        //Poll e Remove -> Obter o próximo elemento da fila e remove!
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // Retorna false
        System.out.println(fila.remove()); //Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll()); //null
        System.out.println(fila.poll()); //null

        System.out.println(fila.contains("Ana"));

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
    }
}
