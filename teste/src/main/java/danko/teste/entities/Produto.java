package danko.teste.entities;

import danko.teste.DTOs.ProdutoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    String name;
    Double price;

    public Produto(ProdutoDTO produtoDTO) {
        this.name = produtoDTO.name();
        this.price = produtoDTO.price();
    }

    public double getWithDiscount(double discount) {
        return price - (price * discount);
    }
}
