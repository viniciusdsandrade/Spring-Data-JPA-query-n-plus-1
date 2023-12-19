package com.restful.springdatajpanplus1query.service;

import com.restful.springdatajpanplus1query.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductService {

    @Transactional(readOnly = true)
    Page<ProductDTO> findAll(PageRequest pageRequest);

    @Transactional(readOnly = true)
    List<ProductDTO> findAllList(PageRequest pageRequest);

    @Transactional(readOnly = true)
    Page<ProductDTO> findAllWithPageable(PageRequest pageRequest);

    @Transactional(readOnly = true)
    Page<ProductDTO> findAllWithPageableWithCountQuery(PageRequest pageRequest);
}