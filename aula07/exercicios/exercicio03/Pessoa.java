package exercicios.exercicio03;

public class Pessoa {
    private String nome, telefone;

    public Pessoa(String nome){
        this.nome = nome;
        telefone = "() - ";

    }

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
@Override //indica que esse metodo é uma sobreescrita da superclasse
    public String toString() {
        return nome + " - " + telefone;
    }

}
