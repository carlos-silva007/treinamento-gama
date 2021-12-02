package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;

        System.out.println("Digite um Numero: ");
        numero = entrada.nextInt();

        if (numero >= 20) {
            metade = (double) numero / 2.0; //cast converte a variavel pra double
            System.out.println("Calcular a metade: " + metade);
        }
        System.out.println("Fim do Programa");
        
        entrada.close();
    }
}
