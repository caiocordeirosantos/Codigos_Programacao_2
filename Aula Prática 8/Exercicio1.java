import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> compras = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n====================");
            System.out.println("Menu de Opções");
            System.out.println("====================");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:
                    adicionar(compras, teclado);
                    break;

                case 2:
                    listar(compras);
                    break;

                case 3:
                    remover(compras, teclado);
                    break;

                case 4:
                    System.out.println("Saindo");
                    break;
            }

        } while (opcao != 4);

        teclado.close();
    }

    public static void adicionar(ArrayList<String> compras, Scanner teclado) {
        System.out.print("Digite o item: ");
        String nomeProduto = teclado.nextLine();
        compras.add(nomeProduto);
    }

    public static void listar(ArrayList<String> compras) {
        System.out.println("\nLista de compras:");

        if (compras.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (int i = 0; i < compras.size(); i++) {
                System.out.println(i + " - " + compras.get(i));
            }
        }
    }

    public static void remover(ArrayList<String> compras, Scanner teclado) {
        if (compras.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        listar(compras);

        System.out.print("Digite o índice para remover: ");
        int indice = teclado.nextInt();

        if (indice >= 0 && indice < compras.size()) {
            compras.remove(indice);
        } else {
            System.out.println("Índice inválido!");
        }
    }
}
