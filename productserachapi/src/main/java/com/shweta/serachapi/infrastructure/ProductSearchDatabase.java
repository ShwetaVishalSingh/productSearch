package com.shweta.serachapi.infrastructure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class ProductSearchDatabase {
    @Id
    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "CONNECTED_COMPONENTS")
    private String connectedcomponents;


    public ProductSearchDatabase() {
    }

    public ProductSearchDatabase(String productId, String productName, String connectedcomponents) {
        this.productId = productId;
        this.productName = productName;
        this.connectedcomponents = connectedcomponents;
    }

    public static ProductSearchDatabase of(Product product) {
        return new ProductSearchDatabase(product.getProductId(), product.getProductName(), product.getConnectedComponents());
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getConnectedcomponents() {
        return connectedcomponents;
    }

    public void setConnectedcomponents(String connectedcomponents) {
        this.connectedcomponents = connectedcomponents;
    }
}

