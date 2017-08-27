package com.sam.model;

import java.io.Serializable;

/**
 * Created by root on 3/8/17.
 */
public class Seller implements Serializable {

    private String sellerId;
    private String sellerName;
    private ContactDetails contactDetails;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;

        Seller seller = (Seller) o;

        if (sellerId != null ? !sellerId.equals(seller.sellerId) : seller.sellerId != null) return false;
        if (sellerName != null ? !sellerName.equals(seller.sellerName) : seller.sellerName != null) return false;
        return !(contactDetails != null ? !contactDetails.equals(seller.contactDetails) : seller.contactDetails != null);

    }

    @Override
    public int hashCode() {
        int result = sellerId != null ? sellerId.hashCode() : 0;
        result = 31 * result + (sellerName != null ? sellerName.hashCode() : 0);
        result = 31 * result + (contactDetails != null ? contactDetails.hashCode() : 0);
        return result;
    }
}
