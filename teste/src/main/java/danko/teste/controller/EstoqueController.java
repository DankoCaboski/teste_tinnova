package danko.teste.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danko.teste.DTOs.ProdutoDTO;
import danko.teste.entities.Produto;
import danko.teste.repositories.EstoqueRepositorie;

@RestController 
@RequestMapping("/estoque")
public class EstoqueController {

    EstoqueRepositorie estoque = new EstoqueRepositorie();
    
    @GetMapping
    public List<Produto> getProdutos() {
        return estoque.getProdutos();
    }

    @PostMapping
    public void addProduto(@RequestBody ProdutoDTO produto) {
        Produto produtoToAdd = new Produto(produto);
        estoque.addProduto(produtoToAdd);
    }
}
