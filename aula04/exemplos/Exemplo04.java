package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String palavra1, palavra2;

        palavra1 = "laranja";
        palavra2 = "goiaba";

        System.out.println(palavra1.equals(palavra2)); //compara as duas variaves
        System.out.println(palavra1.equals("Laranja")); //compara com o texto
        System.out.println(palavra1.equalsIgnoreCase("laranja"));//ignora maisculo e minusculo


    }
}
