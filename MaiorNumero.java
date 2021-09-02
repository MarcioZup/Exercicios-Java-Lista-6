import java.util.Scanner;

public class MaiorNumero {
    //Programa que lê 5 números e informa o maior número
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totaldeNumeros = 5;
        int contadorIndice = 1;
        int maiorNumero = 0;
        int numeroDigitado;

        while(contadorIndice <= totaldeNumeros) {
            System.out.println("Informe o " + contadorIndice + "º número: ");
            numeroDigitado = teclado.nextInt();
            if (numeroDigitado > maiorNumero){
                maiorNumero = numeroDigitado;
            }
            contadorIndice++;
        }
        System.out.println("O maior número digitado foi " + maiorNumero + ".");
        teclado.close();
    }
}
