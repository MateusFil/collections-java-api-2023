package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();

            }

        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();
        estoque.adicionarProduto(15,"PRODUTO A",10,5.0);
        estoque.adicionarProduto(22,"PRODUTO B",5,2.0);
        estoque.adicionarProduto(44,"PRODUTO C",3,7.0);
        estoque.adicionarProduto(1,"PRODUTO D",8,10.0);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: RS$" + estoque.calcularValorTotalEstoque());
    }


}
