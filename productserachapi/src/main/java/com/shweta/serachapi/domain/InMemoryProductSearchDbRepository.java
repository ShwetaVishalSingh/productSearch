package com.shweta.serachapi.domain;

import com.shweta.serachapi.infrastructure.Payload;
import com.shweta.serachapi.infrastructure.Product;
import com.shweta.serachapi.infrastructure.ProductSearchDatabase;
import com.shweta.serachapi.infrastructure.ProductSearchDbRepository;

import java.util.List;

public class InMemoryProductSearchDbRepository implements ProductSearchRepository {
    private final ProductSearchDbRepository productSearchDbRepository ;

    public InMemoryProductSearchDbRepository(ProductSearchDbRepository  productSearchDbRepository ) {
        this.productSearchDbRepository = productSearchDbRepository;
    }
    @Override
    public String fetchSearchProduct(String productName) {
        Iterable<ProductSearchDatabase> products = productSearchDbRepository.findAll();
        for (ProductSearchDatabase  productSearch : products) {
            if(productSearch.getProductName().equals(productName))
            return productSearch.getConnectedcomponents();
        }
        return null;
    }
    @Override
    public void addProducts(Payload payload) {
        Product product = payload.getProduct();
        //ProductSearchDatabase productSearchDatabase = ProductSearchDatabase.of(product);
        ProductSearchDatabase productSearchDatabase = new ProductSearchDatabase(product.getProductId(), product.getProductName(), product.getConnectedComponents());
        productSearchDbRepository.save(productSearchDatabase);


    }
}
