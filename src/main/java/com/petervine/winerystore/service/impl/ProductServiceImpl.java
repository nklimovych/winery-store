package com.petervine.winerystore.service.impl;

import com.petervine.winerystore.dto.ProductDto;
import com.petervine.winerystore.exception.NoProductWithSuchIdException;
import com.petervine.winerystore.model.Product;
import com.petervine.winerystore.repository.ProductRepository;
import com.petervine.winerystore.repository.ProductTypeRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl {

    private final ProductRepository productRepository;
    private final ProductTypeRepository productTypeRepository;
    private final ModelMapper mapper;


    public List<ProductDto> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> mapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    public ProductDto saveOrUpdate(ProductDto productDto) {
        Product product = mapper.map(productDto, Product.class);
        product = productRepository.save(product);
        return mapper.map(product, ProductDto.class);
    }

    public Boolean deleteById(Long productId) throws NoProductWithSuchIdException {
        Product productToDelete = productRepository
                .findById(productId).orElseThrow(() -> new NoProductWithSuchIdException("No product with such id"));
        productRepository.delete(productToDelete);
        return true;
    }

    public ProductDto findById(Long productId) throws NoProductWithSuchIdException {
        return mapper.map(productRepository.findById(productId)
                .orElseThrow(() -> new NoProductWithSuchIdException("No product with such id")), ProductDto.class);
    }
}
