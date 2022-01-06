package bee;

//import java.text.DecimalFormat;
import java.util.Scanner;


public class Bee1048 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //DecimalFormat dec = new DecimalFormat("0.00");

        Double salario = entrada.nextDouble();
        Double reajuste;
        Double novoSalario = 0.00;
        int percentual;

        if (salario >= 0 && salario <= 400) {
            reajuste = salario * 0.15;
            novoSalario = salario + reajuste;
            percentual = 15;
        } else if (salario > 400 && salario < 800) {
            reajuste = salario * 0.12;
            novoSalario = salario + reajuste;
            percentual = 12;
        } else if (salario > 800 && salario <= 1200) {
            reajuste = salario * 0.10;
            novoSalario = salario + reajuste;
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000) {
            reajuste = salario * 0.07;
            novoSalario = salario + reajuste;
            percentual = 7;
        } else {
            reajuste = salario * 0.04;
            percentual = 4;
        }
        System.out.printf("Novo Salario: %.2f\n", (novoSalario));
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        entrada.close();

    }
}
