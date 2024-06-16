package danko.teste.repositories;

import java.util.LinkedList;

import danko.teste.entities.Produto;

public class ProdutoRepositorie {
    
    LinkedList<Produto> produtos = new LinkedList<Produto>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
}
