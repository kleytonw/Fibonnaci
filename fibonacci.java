import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ndigitado;

        System.out.print("Digite um número: ");
        ndigitado = scanner.nextInt();

        int[] numeros = new int[ndigitado + 2];
        numeros[0] = 0;
        numeros[1] = 1;

        int i = 2;
        boolean pertenceFibonacci = false;

        if (ndigitado == 0 || ndigitado == 1) {
            pertenceFibonacci = true;
        } else {
            do {
                numeros[i] = numeros[i - 1] + numeros[i - 2];

                if (ndigitado == numeros[i]) {
                    pertenceFibonacci = true;
                    break;
                }

                i++;
            } while (numeros[i-1] <= ndigitado);

        }

        if (pertenceFibonacci) {
            System.out.println("O número " + ndigitado + " pertence à sequência Fibonacci.");
        } else {
            System.out.println("O número " + ndigitado + " não pertence à sequência Fibonacci.");
        }

        scanner.close();
    }
}
