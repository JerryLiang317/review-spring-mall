package com.jerry.reviewspringmall.service.impl;

import com.jerry.reviewspringmall.dao.ProductDao;
import com.jerry.reviewspringmall.model.Product;
import com.jerry.reviewspringmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}