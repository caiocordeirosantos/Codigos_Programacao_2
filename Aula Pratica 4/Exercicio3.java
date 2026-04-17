import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoCombustivel;
        double litrosGasolina, litrosAlcool, precoGasolina, precoAlcool, totalGasolina, totalAlcool;

        precoGasolina = 6;
        precoAlcool = 4.5;

        litrosGasolina = 0;
        litrosAlcool = 0;

        System.out.print("Informe o tipo de combustível desejado (A-álcool ou G-gasolina): ");
        tipoCombustivel = scanner.nextLine();

        if (tipoCombustivel.equals("G")) {
            System.out.print("Informe a quantidade de litros de gasolina que você quer comprar: ");
            litrosGasolina = scanner.nextDouble();

            if (litrosGasolina <= 20) {
                totalGasolina = litrosGasolina * precoGasolina * (1- 0.04);
            } else {
                totalGasolina = litrosGasolina * precoGasolina * (1 - 0.06);
            }

            System.out.printf("O valor a ser pago é $" + totalGasolina);

        } else if (tipoCombustivel.equals("A")) {
            System.out.print("Informe a quantidade de litros de álcool que você quer comprar: ");
            litrosAlcool = scanner.nextDouble();
            
            if (litrosAlcool <= 20) {
                totalAlcool = litrosAlcool * precoAlcool * (1 - 0.03);
            } else {
                totalAlcool = litrosAlcool * precoAlcool * (1 - 0.05);
            }

            System.out.println("O valor a ser pago é $" + totalAlcool);
        } else {
            System.out.print("Esse tipo de combustível não é válido!");
        }
        scanner.close();
    }
}
