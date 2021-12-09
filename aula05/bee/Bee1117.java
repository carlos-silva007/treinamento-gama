package bee;

import java.util.Scanner;

public class Bee1117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1 = entrada.nextDouble();
        while (n1 > 10 || n1 < 0) {
            System.out.println("nota invalida");
            n1 = entrada.nextDouble();
        }
        double n2 = entrada.nextDouble();
        while (n2 > 10 || n2 < 0) {
            System.out.println("nota invalida");
            n2 = entrada.nextDouble();
        }
        double media = (n1 + n2) / 2;
        System.out.println(String.format("media = %.2f", media));

        entrada.close();

    }
}
