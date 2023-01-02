package com.dg.SpringBootCRUD.service;

import com.dg.SpringBootCRUD.entity.Product;
import com.dg.SpringBootCRUD.repository.ProductReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductReposotory reposotory;

    public Product saveProduct(Product product)
    {
        return reposotory.save(product);
    }

    public List<Product> saveProducts(List<Product> product)
    {
        return reposotory.saveAll(product);

    }

    public List<Product> getProducts()
    {
        return reposotory.findAll();
    }
    public Product getProductById(int id)
    {
        return reposotory.findById(id).orElse(null);
    }
    public Product getProductName(String name)
    {
        return reposotory.findByName(name);
    }
    public String deleteProduct(int id)
    {
    reposotory.deleteById(id);
    return  "Product Removed" +id;
    }

    public Product updateProduct(Product product)
    {
        Product existingProduct=reposotory.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return reposotory.save(existingProduct);
    }


}
