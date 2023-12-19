package com.restful.springdatajpanplus1query.Mapper;

import com.restful.springdatajpanplus1query.dto.ProductDTO;
import com.restful.springdatajpanplus1query.entity.Product;

public class ProductMapper {
    
    public static ProductDTO mapsToProduct(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getCategories()
        );
    }
    
    public static Product mapsToProductDTO(ProductDTO productDTO) {
        return new Product(
                productDTO.getId(),
                productDTO.getName(),
                productDTO.getCategories()
        );
    }
}