package exercicios.exercicio01;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(22, 20, 50);

        System.out.println(relogio.getHoraAtual());

        relogio.setHora(31);
        System.out.println(relogio.getHoraAtual());
    }
}
