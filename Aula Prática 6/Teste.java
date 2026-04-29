public class Teste {
    public static void main(String[] args) {
        Produto obj1 = new Produto("Celular", 1000, 200);
        Produto obj2 = new Produto("Processador", 4000, 50);
        Produto obj3 = new Produto("Placa de Vídeo", 21000, 25);
        obj1.exibirinfo();
        obj2.exibirinfo();
        obj3.exibirinfo();

        obj1.calcularValorTotalEmEstoque();
        System.out.println("O valor total em estoque do produto " + obj1.nome + " é " + obj1.quantidadeTotalEstoque);
        System.out.println("====================================================");

        obj3.adicionarEstoque(25);
        obj3.exibirinfo();
    }
}
