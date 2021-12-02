package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario, parcela, limite;

        System.out.println("Digite o Salario: R$ ");
        salario = entrada.nextDouble();

        System.out.println("Digite a Parcela: R$ ");
        parcela = entrada.nextDouble();

        limite = salario * 0.3;

        if (parcela <= limite) {
            System.out.println("Emprestimo Aprovado!! ");
        } else {
            System.out.println("Emprestimo Reprovado");
        }

        entrada.close();
    }
}
