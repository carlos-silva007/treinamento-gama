package bee;

import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor1, valor2, prod;

        valor1 = entrada.nextInt();
        valor2 = entrada.nextInt();

        prod = valor1 * valor2;

        System.out.println("PROD = " + prod);

        entrada.close();

    }
}
