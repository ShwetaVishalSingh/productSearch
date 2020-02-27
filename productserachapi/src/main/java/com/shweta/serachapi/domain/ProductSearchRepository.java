package com.shweta.serachapi.domain;

import com.shweta.serachapi.infrastructure.Payload;

import java.util.List;

public interface ProductSearchRepository {
    String fetchSearchProduct(String productName) ;
    void addProducts(Payload payload);

}
