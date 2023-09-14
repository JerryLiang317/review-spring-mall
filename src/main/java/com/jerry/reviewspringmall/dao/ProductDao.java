package com.jerry.reviewspringmall.dao;

import com.jerry.reviewspringmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
