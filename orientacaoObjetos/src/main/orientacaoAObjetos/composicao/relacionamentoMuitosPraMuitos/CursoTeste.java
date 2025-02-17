package composicao.relacionamentoMuitosPraMuitos;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Marcos");
        Aluno aluno3 = new Aluno("Maria");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("C#");
        Curso curso3 = new Curso("Python");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCursos(curso3);
        aluno2.adicionarCursos(curso3);
        aluno3.adicionarCursos(curso3);

        for (Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso 1 "+ curso1.nome + "...");
            System.out.println("meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado  = aluno1.ObterCursoPorNome("Java");

        if(cursoEncontrado != null){
            System.out.println("Curso: " + cursoEncontrado.nome);
            System.out.println("Alunos: " + cursoEncontrado.alunos);
        }
    }
}
