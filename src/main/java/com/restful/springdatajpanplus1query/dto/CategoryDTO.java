package com.restful.springdatajpanplus1query.dto;

import com.restful.springdatajpanplus1query.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDTO {
    private Long id;
    private String name;

    public CategoryDTO(Category category) {
        id = category.getId();
        name = category.getName();
    }
}
