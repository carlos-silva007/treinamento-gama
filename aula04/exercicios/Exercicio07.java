package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;

        System.out.println("Digite seu salario: R$ ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.println("Esta Isento de Imposto");
        } else {
            if (salario <= 1200) {
                System.out.println("Desconto 20% ");
            } else {
                if (salario <= 2000) {
                    System.out.println("Desconto 25% ");
                } else {
                    System.out.println("Desconto 30% ");
                }
            }
        }
        entrada.close();

    }
}
