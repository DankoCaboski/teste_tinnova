package danko.teste.entities;

import java.util.LinkedList;

public class Carrinho {
    LinkedList<Produto> myCart = new LinkedList<Produto>();

    public void addProduto(Produto produto) {
        myCart.add(produto);
    }

    public void removeProduto(Produto produto) {
        myCart.remove(produto);
    }

    
}
