package exercicios.exercicios02;

public class Veiculo {
    String modelo;
    String marca;
    private double consumo;

    Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    void apresentacao() {
        System.out.println("Modelo do Carro: " + modelo + "Marca do Veiculo: " + marca);
    }

    double obterConsumo() {
        return consumo;
    }

    public void alterarConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
