import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2;
        double divisao;

        boolean continua = true;

        while (continua) {
            try {
            System.out.println("Digite um número inteiro: ");
            numero1 = scanner.nextInt();

            System.out.println("Digite outro número:");
            numero2 = scanner.nextInt();

            divisao = (double) numero1 / numero2;
            System.out.println("O resultado da divisão é: " + divisao);

            continua = false;

        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números inteiros");
            scanner.next();
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir um número por 0! Por favor tente novamente");
        }

        }
        
        scanner.close();
    }
}
