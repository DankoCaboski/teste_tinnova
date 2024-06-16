package danko.teste.entities;

import java.util.LinkedList;

public class Carrinho {
    public static LinkedList<Produto> myCart = new LinkedList<Produto>();
    
    public LinkedList<Produto> getProdutos() {
        return myCart;
    }

    public void addProduto(Produto produto) {
        myCart.add(produto);
    }

    public void removeProduto(Produto produto) {
        myCart.remove(produto);
    }


}
