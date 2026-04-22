public class Exercicio3 {
    public static boolean elementoExiste (String[] palavras, String busca) {
        for (String i : palavras) {
            if (i.equals(busca)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String [] palavras = {"Computador", "Python", "Java", "Programação", "Carro"};

        System.out.println(elementoExiste(palavras, "Java"));
        System.out.println(elementoExiste(palavras, "Caio"));
    }
}
