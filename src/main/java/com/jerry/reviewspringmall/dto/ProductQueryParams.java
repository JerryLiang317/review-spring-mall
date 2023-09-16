package com.jerry.reviewspringmall.dto;

import com.jerry.reviewspringmall.constant.ProductCategory;
import lombok.Data;

@Data
public class ProductQueryParams {
    private ProductCategory category;
    private String search;
}
