package exercicios.exercicio01;

public class Relogio {
    private int hora, minuto, segundo;

    // CONSTRUTOR
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String getHoraAtual() {
        return hora + ":" + minuto + ":" + segundo;
        // return String.format("%02d:%02d:%02d", hora, minuto, segundo); outro modo
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int horaCerta) {
        if (horaCerta >= 0 && horaCerta < 24) {
            hora = horaCerta;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minutoCerto) {
        if (minutoCerto >= 0 && minutoCerto < 60) {
            minuto = minutoCerto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundoCerto) {
        if (segundoCerto >= 0 && segundoCerto < 60) {
            segundo = segundoCerto;
        }
    }

}
