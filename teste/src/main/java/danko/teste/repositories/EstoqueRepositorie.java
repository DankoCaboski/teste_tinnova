package danko.teste.repositories;

import java.util.LinkedList;
import java.util.List;

import danko.teste.entities.Produto;

public class EstoqueRepositorie {
    
    public static LinkedList<Produto> produtos = new LinkedList<Produto>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}