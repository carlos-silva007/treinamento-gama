package exemplos.exemplo01;

public class Veiculo {
    private String marca, modelo;
    private double consumo; // só pode ser usando dentro da classe private deixa atributo invisivel

   public Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        setConsumo(consumo);
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " Modelo: " + modelo);
    }

   public double getConsumo() {
        return consumo;
    }
//novo metodo criado, criando nova regra pra usuario alterar
    void setConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }

}
