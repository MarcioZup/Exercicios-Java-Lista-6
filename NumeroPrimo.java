import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        //Este programa recebe um número e diz se ele é primo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para saber se ele é primo: ");
        int numeroDigitado = teclado.nextInt();
        int resultado = 0;

        for (int i = 2; i <= (Math.round(numeroDigitado / 2)); i++) {
            if (numeroDigitado % i == 0)
                resultado++;
            break;
        }
        if (resultado == 0) {
            System.out.println("Este número é primo");
        } else {
            System.out.println("Este número não é primo");
        }
    }
}



