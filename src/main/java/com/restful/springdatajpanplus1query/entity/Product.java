package com.restful.springdatajpanplus1query.entity;

import com.restful.springdatajpanplus1query.dto.CategoryDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Product")
@Table(name = "tb_product",
        schema = "db_spring_data_jpa_n_plus_1_query")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "tb_product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories = new HashSet<>();
    
    public Product(Long id, String name, List<CategoryDTO> categories) {
        super();
        this.id = id;
        this.name = name;
        this.categories = categories.stream().map(Category::new).collect(Collectors.toSet());
    }
}
