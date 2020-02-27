package com.shweta.serachapi.infrastructure;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Payload {
    private Product product;

    @JsonCreator
    public Payload(@JsonProperty("product") Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

}
