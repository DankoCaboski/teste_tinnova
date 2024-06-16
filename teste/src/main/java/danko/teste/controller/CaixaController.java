package danko.teste.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import danko.teste.DTOs.DiscountRequest;


@RestController
@RequestMapping("/caixa")
public class CaixaController {
    @PostMapping("/discount")
    public double calculateTotal(@RequestBody DiscountRequest discountRequest) {
        double discountedTotal = discountRequest.totalPrice() - discountRequest.discount();
        return discountedTotal;
    }
}
