package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(5L, "PRODUTO 5", 15d, 5);
        cadastroProdutos.adicionarProduto(4L, "PRODUTO 4", 5d, 5);
        cadastroProdutos.adicionarProduto(2L, "PRODUTO 3", 4d, 5);
        cadastroProdutos.adicionarProduto(3L, "PRODUTO 2", 3d, 5);
        //System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());

    }

}
