import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        System.out.println("Informe a quantidade comprada desse produto: ");
        int quantidade = scanner.nextInt();

        double totalCompra = valorProduto * quantidade;

        double desconto = totalCompra - (totalCompra * 0.08);

        if (totalCompra > 100) {
            System.out.println("Você obteve um desconto de 8%, então o valor total de sua compra é: " + desconto);
        } else {
            System.out.println("O valor total da compra é " + totalCompra);
        }

        scanner.close();
    }
}
