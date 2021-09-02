import java.util.Scanner;

public class ImparesEntre1e50 {
    public static void main(String[] args) {
        // Programa que imprime na tela apenas os números ímpares entre 1 e 50
        System.out.println("Estes são os números primos no intervalo entre 1 e 50: ");
        for (int i = 1; (i <=50); i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }

        }

    }
}
