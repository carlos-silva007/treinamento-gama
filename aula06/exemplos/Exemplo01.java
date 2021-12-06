package exemplos;


public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("programa v0.1");
        linha2(10);
        linha2(20);
        
    }

    static void linha() {
        System.out.println("---------------");
    }

    static void linha2(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
     System.out.println();
    }
}