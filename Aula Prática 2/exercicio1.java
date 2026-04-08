import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int num1 = scanner.nextInt();

        int dobro = num1 * 2;
        int triplo = num1 * 3;

        System.out.println("O dobro de " + num1 + " é " + dobro + " e seu triplo é " + triplo);

        scanner.close();
    }
}
