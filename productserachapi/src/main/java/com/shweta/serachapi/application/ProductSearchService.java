package com.shweta.serachapi.application;

import com.shweta.serachapi.domain.ProductSearchRepository;
import com.shweta.serachapi.infrastructure.Payload;

import java.util.List;

public class ProductSearchService {
    private ProductSearchRepository productSearchRepository;

    public ProductSearchService(ProductSearchRepository productSearchRepository) {
        this.productSearchRepository= productSearchRepository;
    }

    public String fetchSearchProducts(String productName)  {
        return productSearchRepository.fetchSearchProduct(productName);
    }

 public void addProducts(Payload payload){
        productSearchRepository.addProducts(payload);
 }

}
