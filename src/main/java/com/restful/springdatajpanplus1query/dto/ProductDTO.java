package com.restful.springdatajpanplus1query.dto;

import com.restful.springdatajpanplus1query.entity.Category;
import com.restful.springdatajpanplus1query.entity.Product;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;

    @Setter(AccessLevel.NONE)
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO() {
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        categories = product.getCategories().stream().map(CategoryDTO::new).collect(Collectors.toList());
    }

    public ProductDTO(Long id, String name, Set<Category> categories) {
        super();
        this.id = id;
        this.name = name;
        this.categories = categories.stream().map(CategoryDTO::new).collect(Collectors.toList());
    }
}