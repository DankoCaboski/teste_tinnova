package danko.teste.entities;

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

    public double getWithDiscount(double discount) {
        return price - (price * discount);
    }
}
