package com.petervine.winerystore.controller;

import com.petervine.winerystore.dto.ProductDto;
import com.petervine.winerystore.exception.NoProductWithSuchIdException;
import com.petervine.winerystore.service.impl.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductServiceImpl productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping
    public ResponseEntity<ProductDto> saveProduct(@RequestBody ProductDto productDto) {
        return ResponseEntity.ok(productService.saveOrUpdate(productDto));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long productId) throws NoProductWithSuchIdException {
        return ResponseEntity.ok(productService.findById(productId));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Boolean> deleteProductById(@PathVariable Long productId) throws NoProductWithSuchIdException {
        return ResponseEntity.ok(productService.deleteById(productId));
    }
}
