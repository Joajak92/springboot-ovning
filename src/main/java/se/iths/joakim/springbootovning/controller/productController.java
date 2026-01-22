package se.iths.joakim.springbootovning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.joakim.springbootovning.model.Product;

import java.util.List;

@Controller
@RequestMapping
public class productController {
    @GetMapping("/products")
    public List<Product> productList(Model model) {
        List<Product> products = List.of(
                new Product("gun", 19.99, "so that you can shoot yourself"),
                new Product("magazine", 5.99, "so that you can load your gun"),
                new Product("bullets", 14.99, "200 bullets in a bag"));
        model.addAttribute(products);
        return products;
    }
}
