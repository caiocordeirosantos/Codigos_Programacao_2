import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");

        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Você pode votar!");
        } else {
            System.out.println("Você não pode votar!");
        }

        scanner.close();
    }   
}
