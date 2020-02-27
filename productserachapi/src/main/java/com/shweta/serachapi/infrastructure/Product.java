package com.shweta.serachapi.infrastructure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    private String productId;
    private String productName;
    private String connectedComponents;

    @JsonCreator
    public Product(@JsonProperty("productId") String productId, @JsonProperty("productName") String productName, @JsonProperty("connectedComponents") String connectedComponents) {
        this.productId = productId;
        this.productName = productName;
        this.connectedComponents = connectedComponents;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getConnectedComponents() {
        return connectedComponents;
    }
}


