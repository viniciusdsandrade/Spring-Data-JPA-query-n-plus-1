package com.restful.springdatajpanplus1query.repository;

import com.restful.springdatajpanplus1query.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories")
    List<Product> findProductsCategories();

    @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products")
    List<Product> findProductCategoriesWithPage(List<Product> products);
}
