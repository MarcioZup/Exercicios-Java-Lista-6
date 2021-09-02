import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Media4Notas {
    //Programa que lê 4 notas, mostra as notas e a média na tela
    public static void main(String[] args) {
        double notaDigitada;
        double media;
        Scanner teclado = new Scanner(System.in);
        List <Double> notas = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite a nota " + i + ": ");
            notas.add(teclado.nextDouble());
        }
        media = ((notas.get(0) + notas.get(1) + notas.get(2) + notas.get(3)) / 4 );
        System.out.println("As quatro notas são " + notas + " e a média delas é " + media);
    }
}
