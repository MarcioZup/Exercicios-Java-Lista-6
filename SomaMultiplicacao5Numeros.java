import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaMultiplicacao5Numeros {
    //Programa que leia uma lista de 5 números inteiros, mostre a soma, a multiplicação e os números.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado;
        int quantidadeNumeros = 5;
        int contador = 1;
        List<Integer> numeros = new ArrayList<>();


        while (contador <= quantidadeNumeros ) {
            System.out.println("Digite um número: ");
            numeroDigitado = teclado.nextInt();
            numeros.add(numeroDigitado);
            contador++;
        }
        teclado.close();
        int soma = (numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4));
        int multiplicacao = (numeros.get(0) * numeros.get(1) * numeros.get(2) * numeros.get(3) * numeros.get(4));
        System.out.println("Os números digitados são " + numeros + ", a soma deles é " + soma + " e a multiplicação deles é " + multiplicacao);

    }
}
