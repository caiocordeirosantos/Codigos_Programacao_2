public class Exercicio2 {
    public static int maxValor (int[] numeros) {
        int maiorValor;
        maiorValor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }
        
        return maiorValor;
    }

    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(maxValor(numeros));
    }
}
