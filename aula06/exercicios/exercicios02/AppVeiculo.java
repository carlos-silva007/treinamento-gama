package exercicios.exercicios02;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Corolla\n", "Toyota", 22.5);

        carro1.apresentacao();
        //System.out.println("Consumo: " + carro1.obterConsumo());
carro1.alterarConsumo(10);

System.out.println("Consumo: " + carro1.obterConsumo());

    }
}
