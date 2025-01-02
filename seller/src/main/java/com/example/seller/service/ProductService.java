package com.example.seller.service;

import com.example.seller.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "IPhone", "desc", 60000, "Moscow", "Todd"));
        products.add(new Product(++ID,"MacBook", "desc", 100000, "Moscow", "Ben"));
    }

    public List<Product> getAllProduct()
    {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
