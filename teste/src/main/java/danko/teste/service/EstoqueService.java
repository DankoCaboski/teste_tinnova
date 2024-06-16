package danko.teste.service;

import org.springframework.stereotype.Service;

import danko.teste.entities.Produto;
import danko.teste.repositories.EstoqueRepositorie;

@Service
public class EstoqueService {
    
    public static boolean produtInStock(Produto produto) {
        for (Produto item : EstoqueRepositorie.getProdutos()) {
            if (produto.getName() == item.getName()) {
                return true;
            }
        }
        return false;
    }
}
