public class Produto {
    String nome;
    double preco;
    int quantidadeTotalEstoque;

    Produto (String nome, double preco, int quantidadeInicialEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeTotalEstoque = quantidadeInicialEstoque; 
    }

    public void exibirinfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("  Preço: " + this.preco);
        System.out.println("  Quantidade em Estoque: " + this.quantidadeTotalEstoque);
        System.out.println("====================================================");
    }

    public double calcularValorTotalEmEstoque () {
        return (preco * quantidadeTotalEstoque);
    }

    public void adicionarEstoque (int quantidade) {
        quantidadeTotalEstoque += quantidade;
    }

}