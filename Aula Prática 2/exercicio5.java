import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorIngresso = 40;

        System.out.print("Informe o tipo de ingresso que deseja comprar (I para inteira e M para meia): ");
        String tipoIngresso = scanner.nextLine();

        if (tipoIngresso.equals("I") || tipoIngresso.equals("i")) {
            System.out.print("O valor a ser pago é " + valorIngresso);
        } else if (tipoIngresso.equals("M") || tipoIngresso.equals("m")) {
            double meiaEntrada = valorIngresso / 2;
            System.out.print("O valor a ser pago é: " + meiaEntrada);
        } else {
            System.out.print("Valor Inválido!");
        }
    }
}
