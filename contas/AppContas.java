
import modelo.ContaPoupanca;

public class AppContas {

    public static void main(String[] args) {

        ContaPoupanca conta = new ContaPoupanca(4083);
        conta.setTaxa(2.40);
        System.out.println(conta.toString());

        conta.deposito(200);
        System.out.println(conta);

        if (conta.saque(100)) {
            System.out.println("Saque Feito ");
        } else {
            System.out.println("Sem Saldo ");
        }
        System.out.println(conta);
    }

}