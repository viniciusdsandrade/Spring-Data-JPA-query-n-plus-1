package com.restful.springdatajpanplus1query.controller;

import com.restful.springdatajpanplus1query.dto.ProductDTO;
import com.restful.springdatajpanplus1query.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/products")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size
    ) {

        PageRequest pageRequest = PageRequest.of(page, size);
        Page<ProductDTO> list = service.findAll(pageRequest);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/products-categories")
    public ResponseEntity<List<ProductDTO>> findProductsCategories(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size
    ) {

        PageRequest pageRequest = PageRequest.of(page, size);
        List<ProductDTO> list = service.findAllList(pageRequest);
        return ResponseEntity.ok(list);
    }
    
    @GetMapping(value = "/products-pageable")
    public ResponseEntity<Page<ProductDTO>> findProductsPageable(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size
    ) {

        PageRequest pageRequest = PageRequest.of(page, size);
        Page<ProductDTO> list = service.findAllWithPageable(pageRequest);
        return ResponseEntity.ok(list);
    }
}