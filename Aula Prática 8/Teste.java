import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.print("Digite a altura: ");
        double h = teclado.nextDouble();
        r.setAltura(h);

        System.out.print("Digite a largura: ");
        double l = teclado.nextDouble();
        r.setLargura(l);

        System.out.println("\nÁrea: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        teclado.close();
    }
}
