package com.shweta.serachapi.infrastructure;

import com.shweta.serachapi.application.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping( "/api/search/")
public class ProductSearchController {
    private  ProductSearchService productSearchService;


    @Autowired
    public ProductSearchController(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @GetMapping(value = "{productName}")
    public ResponseEntity fetchSearchProducts(@PathVariable String productName){

        String  filteredList = productSearchService.fetchSearchProducts(productName);
        String[] spilited = filteredList.split("-");

        return ResponseEntity.ok(Arrays.asList(spilited));

    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Payload payload) {
        productSearchService.addProducts(payload);
        return ResponseEntity.ok().body("Products has been added");
    }


}
