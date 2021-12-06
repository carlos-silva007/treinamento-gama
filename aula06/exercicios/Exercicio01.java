package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero = 19;

        if (ehPar(numero)) {
            System.out.println(numero + ": Numero é Par");
        } else {
            System.out.println(numero + ": Numero é Impar");
        }

    }
//CRIA UM PROGRAMA QUE LE UM NUMETO INTEIRO E RETORNA SE É PAR OU IMPAR
    public static boolean ehPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        }
        return false;

    }

}
