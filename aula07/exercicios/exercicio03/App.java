package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Carlos", "19 99172-3013");
        Pessoa pessoa2 = new Pessoa("Dayana");
        Estudante aluno = new Estudante("Carlinhos", "19 9172-3011", "JAVA");
        Professor prof = new Professor("Emerson", "11 99258-2032", 3500);

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
        System.out.println(aluno.toString());
        
        System.out.println(prof.toString());
    }

}
