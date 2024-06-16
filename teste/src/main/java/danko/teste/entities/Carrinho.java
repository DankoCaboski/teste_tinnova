package danko.teste.entities;

import java.util.LinkedList;

import org.springframework.http.ResponseEntity;

import danko.teste.service.EstoqueService;

public class Carrinho {
    public static LinkedList<Produto> myCart = new LinkedList<Produto>();
    
    public LinkedList<Produto> getProdutos() {
        return myCart;
    }

    public ResponseEntity<?> addProduto(Produto produto) {
        if (EstoqueService.produtInStock(produto)) {
            myCart.add(produto);
        return ResponseEntity.status(201).body("Produto adicionado ao carrinho");
        }
        else {
            return ResponseEntity.status(400).body("O produto não existe no estoque");
        }
    }

    public void removeProduto(Produto produto) {
        myCart.remove(produto);
    }


}
