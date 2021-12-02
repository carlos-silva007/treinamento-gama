package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;
        
        System.out.println("Digite seu Salario: ");
        salario = entrada.nextDouble();
        
        double novoSalario;

        novoSalario = salario + salario * 0.25;
        System.out.println("Novo Salario: " + novoSalario);
        // novoSalario = salario * 1.25; mesma coisa

        entrada.close();
    }
}
