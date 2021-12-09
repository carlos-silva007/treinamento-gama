package modelo;

public class ContaPoupanca extends Conta {
    private static double taxaOperacao = 0.2; //static= atributo da classe

    public ContaPoupanca(int numero) {
        super(numero);
        
    }

    public static void setTaxa(double novaTaxa) { //metodo da classe
        taxaOperacao = novaTaxa;

    }

    @Override
    public boolean saque(double valor) {
        if (valor + taxaOperacao <= getSaldo()) {
            return super.saque(valor + taxaOperacao);
        }
        return false;
    }

    @Override
    public String toString() {
        return "CP: " + super.toString() + " taxa: " + taxaOperacao;
    }
}
