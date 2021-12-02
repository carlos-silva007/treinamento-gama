package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioMinimo, kwConsumido, valorKw;
        double valorTotal, valorComDesconto;
//entrada
        System.out.println("Digite o Salario: R$ ");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite seu consumo: KW ");
        kwConsumido = entrada.nextDouble();

//processamento //cada kw custa 1/500 do salario minimo
        valorKw = salarioMinimo / 500;
        valorTotal = valorKw * kwConsumido;
        valorComDesconto = valorTotal - valorTotal * 0.15;
//saida
        System.out.println("Valor do KW é: R$ " + valorKw);
        System.out.println("Valor da Conta sera: R$ " + valorTotal);
        System.out.println("Valor com desconto: R$ " + valorComDesconto);

        entrada.close();

    }
}
