import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CincoNumerosInteiros {
    //Programa que lê uma lista de 5 números inteiros e os mostra.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeTotalNumeros = 5;
        int contador = 1;
        List <Integer> numerosDigitados = new ArrayList<>();
        while (contador <= quantidadeTotalNumeros){
            System.out.println("Digite o " + contador + "º número: ");
            numerosDigitados.add(teclado.nextInt());
            contador++;
        }
        System.out.println("O números digitados são " + numerosDigitados);
        teclado.close();
    }
}
