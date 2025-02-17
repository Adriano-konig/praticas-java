package encapsulamento.gettersEsetters;

public class Pessoas {

    private int idade;
    private String nome;
    private String sobrenome;

    Pessoas(String nome, String sobrenome, int idade){
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    // Getter
    public int getIdade(){
        return idade;
    }

    // Setter
    public void setIdade(int novoIdade){
        novoIdade = Math.abs(novoIdade);
        if(novoIdade >= 0 && novoIdade <= 120){
            this.idade = novoIdade;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter
    public String getNome(){
        return nome + " " + getSobrenome();
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String toString(){
        return "Meu nome é " + getNome() + " tenho " + getIdade() + " anos";
    }


}
