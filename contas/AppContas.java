import java.util.ArrayList;
import java.util.Scanner;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

public class AppContas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0, numeroConta;
        double limite;

        ContaCorrente cc = null;
        ContaPoupanca cp = null;
        ContaEspecial cs = null;

        ArrayList<Conta> contas = new ArrayList<>();

        while (opcao != 7) { // enquanto for diferente de 7 pra sair

            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Especial");
            System.out.println("3 - Nova Conta Poupança");
            System.out.println("4 - Depositar");
            System.out.println("5 - Sacar");
            System.out.println("6 - Consultar Saldo");
            System.out.println("7 - Sair");
            System.out.print("Sua Opção => ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o numero da Conta: ");
                    numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    contas.add(cc);
                    break;
                case 2:
                    System.out.println("Informe o numero da Conta: ");
                    numeroConta = teclado.nextInt();
                    System.out.println("Informe o valor do limite: ");
                    limite = teclado.nextDouble();
                    cs = new ContaEspecial(numeroConta, limite);
                    contas.add(cs);
                    break;
                case 3:
                    System.out.println("Informe o numero da Conta: ");
                    numeroConta = teclado.nextInt();
                    cp = new ContaPoupanca(numeroConta);
                    contas.add(cp);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Informe o numero da Conta: ");
                    numeroConta = teclado.nextInt();
                    // for (int i = 0; i < contas.size(); i++) {
                    /*
                     * if (contas.get(i).getNumero() == numeroConta) {
                     * 
                     * System.out.println(contas.get(i));
                     * break;
                     */

                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroConta) {

                            System.out.println(conta);
                            break;

                        }
                    }

                    break;
                case 7:

                    break;

                default:
                    System.out.println("Opção Invalida!");
                    break;
            }

        }

        teclado.close();
    }

}