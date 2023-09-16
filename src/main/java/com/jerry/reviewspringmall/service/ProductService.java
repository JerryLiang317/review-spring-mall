package com.jerry.reviewspringmall.service;

import com.jerry.reviewspringmall.dto.ProductRequest;
import com.jerry.reviewspringmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
