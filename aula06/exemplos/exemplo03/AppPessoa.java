package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 1.87);
        Pessoa p2 = new Pessoa("Cintia", 1.72);

        //p1.nome = "Carlos";
       // p1.altura = 1.87;
        p1.apresentar();
        
       // p2.nome = "Cintia";
       // p2.altura = 1.72;
        p2.apresentar();
        
    }
}
