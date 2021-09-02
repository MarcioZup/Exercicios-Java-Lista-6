import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class DezNumerosOrdemInversa {
    //Programa que lê uma lista de 10 números e os mostra na ordem inversa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeDeNumeros = 10;
        int contador = 1;
        List<Integer> numeros = new ArrayList<>();
        while (quantidadeDeNumeros >= contador) {
            System.out.println("Digite um número: ");
            numeros.add(teclado.nextInt());
            quantidadeDeNumeros--;
        }
        teclado.close();
        Collections.reverse(numeros);
        System.out.println("A lista dos números digitadas em ordem inversa é " + numeros);
    }
}
