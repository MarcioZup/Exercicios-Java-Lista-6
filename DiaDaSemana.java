import java.util.Scanner;

public class DiaDaSemana {
    //Este programa recebe um número e diz a qual dia da semana ele corresponde
    public static void main(String[] args) {
        System.out.println("Entre com um número de 1 a 7 para associar a um dia da semana: ");
        Scanner teclado = new Scanner(System.in);
        int numeroDigitado = teclado.nextInt();
        switch (numeroDigitado){
            case 1:
                System.out.println("Esse dia é Domingo");
                break;
            case 2:
                System.out.println("Esse dia é Segunda");
                break;
            case 3:
                System.out.println("Esse dia é Terça");
                break;
            case 4:
                System.out.println("Esse dia é Quarta");
                break;
            case 5:
                System.out.println("Esse dia é Quinta");
                break;
            case 6:
                System.out.println("Esse dia é Sexta");
                break;
            case 7:
                System.out.println("Esse dia é Sábado");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}
