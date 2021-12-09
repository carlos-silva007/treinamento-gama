import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {
        // indicar a chave e o valor
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Tres");

        String resposta = mapa.get(2); // busca a informacao da chave 2 dentro do hash
        System.out.println(resposta);
        // ou
        System.out.println(mapa.get(3));

        if(mapa.get(3)!= null){
            System.out.println("Achouu");
        } else {
            System.out.println("Nao Achou");
        }

    }
}