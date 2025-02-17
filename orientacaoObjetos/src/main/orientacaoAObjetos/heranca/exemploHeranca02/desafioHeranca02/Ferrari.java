package heranca.exemploHeranca02.desafioHeranca02;

public class Ferrari extends Carro {

    Ferrari(){
        this(315);
    }

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }
//    @Override
//    void acelerar() {
//        velocidadeAtual += 15;
//    }
}
