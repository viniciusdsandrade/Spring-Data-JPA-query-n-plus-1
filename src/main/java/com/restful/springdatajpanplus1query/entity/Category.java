package com.restful.springdatajpanplus1query.entity;

import com.restful.springdatajpanplus1query.dto.CategoryDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "Category")
@Table(name = "tb_category",
        schema = "db_spring_data_jpa_n_plus_1_query")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

    public Category(CategoryDTO categoryDTO) {
        id = categoryDTO.getId();
        name = categoryDTO.getName();
    }
}
