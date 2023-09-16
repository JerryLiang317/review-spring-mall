package com.jerry.reviewspringmall.dao;

import com.jerry.reviewspringmall.dto.ProductQueryParams;
import com.jerry.reviewspringmall.dto.ProductRequest;
import com.jerry.reviewspringmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
