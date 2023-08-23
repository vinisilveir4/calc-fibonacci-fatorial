

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciAndFatorial {

    public static void main(String[] args) {

        int qntNumeros = 0;
        int numeroFatorial = 0;

        try {

            Scanner ler = new Scanner(System.in);

            System.out.print("Digite a quantidade de números da sequência Fibonacci: ");
            qntNumeros = ler.nextInt();

            System.out.print("Agora o número a ser calculado o Fatorial: ");
            numeroFatorial = ler.nextInt();

            if (numeroFatorial == 0 || qntNumeros == 0) {
                throw new InputMismatchException("0 não!");
            }

            sequenciaFibonacci(qntNumeros);
            fatorial(numeroFatorial);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida: " + e.getMessage());
        }

    }

    public static void sequenciaFibonacci(int qnt) {

        System.out.print("Fibonacci de " + qnt + ":");

        int primeiro = 1; int segundo = 1; int proximo = 0;
        for(int i = 0; i < qnt; i++) {
            System.out.print(" " + primeiro);
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

        }


        System.out.println();
    }
    public static void fatorial(int num) {

        int calc = 1;

        for(int i = 1; i <= num; i++) {
            System.out.print(i);

            if(i != num) {
                System.out.print(" x ");
                calc = calc * (i + 1);
            }
        }

        System.out.print(" = " + calc);
    }
}
