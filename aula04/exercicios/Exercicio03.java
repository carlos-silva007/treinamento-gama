package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("Digite os dois numeros: ");
        numero1 = entrada.nextDouble();
        numero2 = entrada.nextDouble();
        
        if (numero1 < numero2) {
            System.out.println(numero1 + " - " + numero2);
        } else {
            System.out.println(numero2 + " - " + numero1);
        }

        entrada.close();

    }
}
