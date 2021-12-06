package bee;

import java.util.Scanner;

public class Bee1003 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

int num1, num2, soma;

num1 = entrada.nextInt();
num2 = entrada.nextInt();

soma = num1 + num2;

System.out.println("SOMA = " + soma);

entrada.close();


    }
}
