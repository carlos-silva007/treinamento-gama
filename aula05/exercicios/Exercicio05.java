package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, pares;
        final int TOTAL_NUMEROS = 10;

        pares = 0;

        for (int i = 0; i <= TOTAL_NUMEROS; i++) {
            System.out.printf("Digite o %dº numero: ", i);
            numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }

        }
        System.out.println("O Total de pares é: " + pares);
        System.out.println("O Total de Impares é: " + (TOTAL_NUMEROS - pares));

        entrada.close();

    }
}
