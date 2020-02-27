package com.shweta.serachapi;

import com.shweta.serachapi.application.ProductSearchService;
import com.shweta.serachapi.domain.InMemoryProductSearchDbRepository;
import com.shweta.serachapi.domain.InMemoryProductSearchRepository;
import com.shweta.serachapi.infrastructure.ProductSearchDbRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductSearchConfiguration {
private ProductSearchService productSearchService;

public ProductSearchConfiguration(ProductSearchDbRepository productSearchDbRepository){
    this.productSearchService = new ProductSearchService(new InMemoryProductSearchDbRepository(productSearchDbRepository));
}

   @Bean
   public ProductSearchService  productSearchService(){
       return productSearchService;
   }
}
