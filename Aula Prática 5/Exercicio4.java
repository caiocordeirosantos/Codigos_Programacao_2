public class Exercicio4 {
    public static int[] contarParesImpares (int[] numeros) {
        int pares = 0;
        int impares = 0;
        int[] resultado = new int[2];

        for (int i : numeros) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        resultado[0] = pares;
        resultado[1] = impares;
        return resultado;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int[] vetor = contarParesImpares(num);
        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
    }
}
