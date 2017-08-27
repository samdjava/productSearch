package com.sam.model;

import java.io.Serializable;

/**
 * Created by root on 3/8/17.
 */
public class Product implements Serializable{

    private String id;
    private String productName;
    private String description;
    private Seller seller;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!productName.equals(product.productName)) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        return seller.equals(product.seller);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
