package exercicios.exercicio02;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Logica de Programação", "Carlos Silva", 300);

        livro.exibirCapa();

        //livro.retrocederPagina();
       // livro.irParaPagina(350);
        livro.avancarPagina();
        livro.retrocederPagina();
        System.out.println("Pagina Atual: " + livro.exibirPagina());

    }

}
