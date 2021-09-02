import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaParesImpares {
    //Programa que leia 20 números e armazene-os numa lista. Armazene os números pares na lista PAR e os números ÍMPARES na lista ímpar. Imprima as três listas.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        int quantidadeDeNumeros = 20;
        Integer numeroDigitado;
        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            System.out.println("Digite um número: ");
            numeroDigitado = teclado.nextInt();
            numeros.add(numeroDigitado);
            if (numeroDigitado % 2 == 0) {
                pares.add(numeroDigitado);
            } else {
                impares.add(numeroDigitado);
            }


        }
        teclado.close();
        System.out.println("Lista de todos os números digitados: " + numeros);
        System.out.println("Lista de todos os números pares digitados: " + pares);
        System.out.println("Lista de todos os números ímpares digitados: " + impares);


    }


}
