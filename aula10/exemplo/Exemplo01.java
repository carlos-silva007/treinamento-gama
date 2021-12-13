package exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String entrada;

        try {
            System.out.println("Digite um numero: ");
            // numero = entrada.nextInt();
            entrada = teclado.nextLine();
            numero = Integer.parseInt(entrada); // transforma texto em numero

            System.out.println("Voce digitou: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Valor Invalido.");
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão");
            System.out.println(e.getMessage()); // pra ver o erro da varial e da excecao
        } catch (Exception e) {
            System.out.println("Erro");
        } finally {
            System.out.println("Fechando");
            teclado.close();
        }

        System.out.println("Fim do Programa");

    }
}