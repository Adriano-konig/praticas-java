package composicao.relacionamentoMuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCursos(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    //Aqui vai retornar um curso e o nome!
    Curso ObterCursoPorNome(String nome){
        for(Curso curso: this.cursos){
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public String toString(){
        return "Meu nome é " + this.nome;
    }
}
