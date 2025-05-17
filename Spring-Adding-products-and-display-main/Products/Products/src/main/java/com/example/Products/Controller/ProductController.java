package com.example.Products.Controller;

import com.example.Products.Entity.ProductDetails;
import com.example.Products.Service.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@AllArgsConstructor
public class ProductController
{
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
        @GetMapping("/index")
    public String homepage(Model model)
    {
//        ProductDetails productDetails=new ProductDetails();
//        model.addAttribute("product",productDetails);
        return "index_page";
    }

    @GetMapping("/addproduct")
    public String addproduct(Model model)
    {
        ProductDetails productDetails=new ProductDetails();
        model.addAttribute("product",productDetails);

        return "Addproduct";
    }

    @PostMapping("/saveProduct")
    public String saveproduct( @ModelAttribute("product") ProductDetails productDetails ,Model model)
    {
        productService.savedata(productDetails);
        model.addAttribute("productDetial",productDetails);

        return "ProductwasAdd";
    }

    @GetMapping("/displayProducts")
    public String allproducts(Model model)
    {
        List<ProductDetails> allproductsList=productService.getallproduct();
        model.addAttribute("products",allproductsList);
        return "totalProducts";
    }
}
