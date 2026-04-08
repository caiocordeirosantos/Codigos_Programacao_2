import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o preço de 1 litro de combustível: ");
        double precoCombustivel = scanner.nextDouble();

        System.out.print("Informe o valor que você possui para abastecer: ");
        double valorAbastecer = scanner.nextDouble();

        double podeComprar;

        podeComprar = valorAbastecer / precoCombustivel;

        System.out.println("Você pode comprar " + podeComprar + " litro(s) de combustível");

        scanner.close();

    }
}
