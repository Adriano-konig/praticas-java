package colecoes.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        //Nesse caso como uma pilha ele vai retornar o ultimo elemento(livro)
        //pois o última a entrar é o primeiro a  sair.
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println();

        for (String livro: livros){
            System.out.println(livro);
        }

        System.out.println();


        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

//        livros.size();
//        livros.pop();
//        livros.remove();
//        livros.contains();
//        livros.isEmpty();

    }
}
