import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("/n======== Menu de Opções ========/n");
        System.out.println("1 - Adicionar Gerente");
        System.out.println("2 - Adicionar Atendente");
        System.out.println("3 - Listar todos os funcionários");
        System.out.println("4 - Mostrar Salário (Informe o CPF do funcionário)");
        System.out.println("5 - Sair");

        int escolha = teclado.nextInt();

        switch(escolha) {
        }
    }

}
