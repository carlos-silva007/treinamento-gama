package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite 3 numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        System.out.println("O menor numero é = " + menorNumero(num1, num2, num3));

        entrada.close();
    }

    public static int menorNumero(int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        }
        if (num2 <= num1 && num2 <= num3) {
            return num2;
        }
        return num3;

    }

}
