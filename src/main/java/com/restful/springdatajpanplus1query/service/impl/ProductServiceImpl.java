package com.restful.springdatajpanplus1query.service.impl;

import com.restful.springdatajpanplus1query.Mapper.ProductMapper;
import com.restful.springdatajpanplus1query.dto.ProductDTO;
import com.restful.springdatajpanplus1query.entity.Product;
import com.restful.springdatajpanplus1query.repository.ProductRepository;
import com.restful.springdatajpanplus1query.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(PageRequest pageRequest) {
        Page<Product> list = repository.findAll(pageRequest);
        return list.map(ProductDTO::new);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductDTO> findAllList(PageRequest pageRequest) {
        List<Product> productList = repository.findProductsCategories();

        return productList.stream()
                .map(ProductMapper::mapsToProduct)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ProductDTO> findAllWithPageable(PageRequest pageRequest) {
        Page<Product> page = repository.findAll(pageRequest);
        repository.findProductCategoriesWithPage(page.getContent());

        return page.map(ProductDTO::new);
    }

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAllWithPageableWithCountQuery(PageRequest pageRequest) {
        Page<Product> page = repository.findAll(pageRequest);
        repository.findProductsCategoriesWithPageWithCountQuery(pageRequest);
        return page.map(ProductDTO::new);
    }
}   