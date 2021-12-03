package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 5;
        int contador = 0;

        System.out.println("Digite um numero");
        numero = entrada.nextInt();

        while (contador <= 10) {
            System.out.println(numero +" X " + contador + " = " + numero * contador);
            contador++;
        }

        entrada.close();

    }
}
