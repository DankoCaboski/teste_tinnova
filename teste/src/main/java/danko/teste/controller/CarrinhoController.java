package danko.teste.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danko.teste.DTOs.ProdutoDTO;
import danko.teste.entities.Carrinho;
import danko.teste.entities.Produto;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    Carrinho carrinho = new Carrinho();

    @GetMapping
    public List<Produto> getProdutos() {
        return carrinho.getProdutos();
    }

    @PostMapping
    public ResponseEntity<?> addProduto(@RequestBody ProdutoDTO produto) {
        Produto produtoToAdd = new Produto(produto);
        return carrinho.addProduto(produtoToAdd);
    }
    
}
