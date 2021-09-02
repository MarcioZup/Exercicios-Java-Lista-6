import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InteirosNoIntervalo {
    //Programa que recebe dois números inteiros e gera os números inteiros que estão no intervalo compreendido por eles
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int primeiroNumero = 0;
        int ultimoNumero = 0;
        System.out.println("Digite o último número do intervalo: ");
        ultimoNumero = teclado.nextInt();
        System.out.println("Digite o primeiro número do intervalo: ");
        primeiroNumero = teclado.nextInt();
        while (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo Inválido. O último número deve ser maior que o primeiro");
            System.out.println("Digite o último número do intervalo: ");
            ultimoNumero = teclado.nextInt();
            System.out.println("Digite o primeiro número do intervalo: ");
            primeiroNumero = teclado.nextInt();
        }
        for (int i = primeiroNumero + 1; i < ultimoNumero; i++) {
            System.out.println("Os números compreendidos entre " + ultimoNumero + " e " + primeiroNumero + " é ");
            System.out.println(i);

        }


    }


}

