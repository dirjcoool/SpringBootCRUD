package com.dg.SpringBootCRUD.repository;

import com.dg.SpringBootCRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReposotory extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
