package com.restful.springdatajpanplus1query.repository;

import com.restful.springdatajpanplus1query.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
