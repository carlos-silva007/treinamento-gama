package exemplos.exemplo03;

public class Pessoa {
    // atributos = caracteristicas
    String nome;
    double altura;

    // metodo construtor
    // nome tem q ser igual ao nome da classe
    // nao pode ter retorno
    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    // metodos = o que faz, ações
    void apresentar() {
        System.out.println("Ola eu sou " + nome);
        System.out.println("Minha altura é: " + altura);
    }

}
