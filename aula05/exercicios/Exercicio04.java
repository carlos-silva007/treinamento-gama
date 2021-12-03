package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // faça um programa que leia os numeros digitados pelo usuario e
        // so vai sair quando usuario digitar 0 e no final soma todos
        // numeros digitados pelo usuario//

        Scanner entrada = new Scanner(System.in);
        int numero = 1, soma = 0, cont = 1;

        while (numero != 0) {
            System.out.println("Digite o " + cont + "º numero: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            cont++;
        }
        System.out.println("Soma Total: " + soma);
        
        entrada.close();
    }
}
