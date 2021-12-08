package modelo;

public class ContaCorrente extends Conta {
    final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero) {
        super(numero);
    }

    @Override
    public boolean saque(double valor) {
        if (valor <= getSaldo()) {
            return super.saque(valor);
        }
        return false;
    }

    @Override
    public boolean deposito(double valor) {
        return super.deposito(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "CC: " + super.toString();
    }
}
