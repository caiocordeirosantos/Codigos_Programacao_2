import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeNadador;

        System.out.print("Informe a idade do nadador: ");
        idadeNadador = scanner.nextInt();

        if (idadeNadador < 5) {
            System.out.println("A idade não pode ser classificada!");
        } else if ((idadeNadador >= 5) && (idadeNadador <= 7)) {
            System.out.println("O nadadaor é da categoria Infantil A");
        } else if ((idadeNadador >= 8) && (idadeNadador <= 10)) {
            System.out.println("O nadador é da categoria Infantil B");
        } else if ((idadeNadador >= 11) && (idadeNadador <= 13)) {
            System.out.println("O nadador é da categoria Juvenil A");
        } else if ((idadeNadador >= 14) && (idadeNadador <= 17)) {
            System.out.println("O nadador é da categoria Juvenil B");
        } else {
            System.out.println("O nadador é da categoria Adulto");
        }
        scanner.close();
    }
}
