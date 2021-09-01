import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        //Este programa lê o preço de três produtos e diz qual é o mais barato
        System.out.println("Entre com o preço do primeiro produto: ");
        Scanner teclado = new Scanner(System.in);
        double produto1 = teclado.nextDouble();
        System.out.println("entre com o preço do segundo produto: ");
        double produto2 = teclado.nextDouble();
        System.out.println("entre com o preço do terceiro produto: ");
        double produto3 = teclado.nextDouble();
        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("O primeiro produto é o mais barato!");
        }else if (produto2 < produto1 & produto2 < produto3){
            System.out.println(" O segundo programa é o mais barato!");
        }else{
            System.out.println("O terceiro programa é o mais barato!");
        }
        teclado.close();
    }
}
