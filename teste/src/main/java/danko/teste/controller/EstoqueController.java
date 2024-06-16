package danko.teste.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
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
        return EstoqueRepositorie.getProdutos();
    }

    @PostMapping
    public ResponseEntity<?> addProduto(@RequestBody ProdutoDTO produto) {
        Produto produtoToAdd = new Produto(produto);
        EstoqueRepositorie.addProduto(produtoToAdd);
        return ResponseEntity.status(201).body("Produto adicionado ao estoque");
    }
}
