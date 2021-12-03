package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite = 0;
        int contador = 1;

        System.out.println("Digite um numero");
        limite = entrada.nextInt();

        while (contador <= limite) {
            if (contador * 2 <= limite) {
                System.out.print(contador + ", ");
            } else {
                System.out.println(contador);
            }
            contador *= 2;
        }

        entrada.close();

    }
}
