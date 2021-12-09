package bee;

import java.util.Scanner;

public class Bee1114 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num = entrada.nextInt();

        while (num != 2002) {
            System.out.println("Senha Invalida");
            num = entrada.nextInt();
        }
        System.out.println("Acesso Permitido");

        entrada.close();
    }
}
