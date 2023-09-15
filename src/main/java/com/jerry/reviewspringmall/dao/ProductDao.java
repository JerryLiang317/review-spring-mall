package com.jerry.reviewspringmall.dao;

import com.jerry.reviewspringmall.dto.ProductRequest;
import com.jerry.reviewspringmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
