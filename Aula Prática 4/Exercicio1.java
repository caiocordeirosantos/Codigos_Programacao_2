import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idaade: ");
        idade = scanner.nextInt();

        if ((idade >= 18) && (idade <= 70)) {
            System.out.println("Você é obrigado a votar!");
        } else if (idade < 16) {
            System.out.println("Você ainda Não pode votar!");
        } else {
            System.out.println("Você não é obrigato a votar!");
        }
        scanner.close();
    }
}
