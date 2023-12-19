package com.restful.springdatajpanplus1query.dto;

import com.restful.springdatajpanplus1query.entity.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {
    private Long id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Category category) {
        id = category.getId();
        name = category.getName();
    }
}
