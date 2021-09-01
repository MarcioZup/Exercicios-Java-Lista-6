import java.util.Scanner;

public class GeradorTabuada {
    public static void main(String[] args) {
        //Programa gerador de tabuada de números inteiros de 1 a 10
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabuada: ");
        int fatorUm = teclado.nextInt();
        int fatorDois = 1;
        while (fatorDois <= 10){
            System.out.println("Tabuada do " + fatorUm);
            System.out.println(fatorUm + " x " + fatorDois + " = " + (fatorUm * fatorDois));
            fatorDois++;
        }
        teclado.close();
    }
}
