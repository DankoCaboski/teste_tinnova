package danko.teste.entities;

public class Caixa {
    
    public double getTotalPrice(Produto[] produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount(Produto[] produtos, double discount) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getWithDiscount(discount);
        }
        return total;
    }

    public double setDicountAtProduct(Produto produto, double discount) {
        return produto.getWithDiscount(discount);
    }
}
