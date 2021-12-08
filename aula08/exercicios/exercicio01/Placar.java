package exercicios.exercicio01;

public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
        nomeTime1 = "Corinthians";
        nomeTime2 = "Palmeiras";
        // golsTime1 = 0; nao necessario informar pois ele ja inicia em 0.
        // golsTime2 = 0;
    }

    public String getPlacar() {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }

    public Placar(String nomeTime1, String nomeTime2, int golsTime1, int golsTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;

    }

    public Placar(String nomeTime1, String nomeTime2) {
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
    }

}
