public class Exercicio5 {
    public static void main(String[] args) {
        
        int[] notas = {7,8,6,10,9};
        int soma = 0;
        double media;
        int acimaMedia = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media = (double) soma / notas.length;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("A média foi: " + media);
        System.out.println("Quantidade de notas acima da média foi: " + acimaMedia);
    }
}
