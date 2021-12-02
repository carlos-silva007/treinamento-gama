package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         * System.out.println(15 + 7);
         * System.out.println(15 - 7);
         * System.out.println(15 * 7);
         * System.out.println(15 / 7);
         * System.out.println(15.0 / 7);
         */
Scanner entrada = new Scanner(System.in);

        double resultado;
        resultado = 15 + 7;
        System.out.println(resultado);
        
        resultado = 15 - 7;
        System.out.println(resultado);
        
        resultado = 15 * 7;
        System.out.println(resultado);
        
        resultado = 15.0 / 7;
        System.out.println(resultado);
entrada.close();

    }
}
