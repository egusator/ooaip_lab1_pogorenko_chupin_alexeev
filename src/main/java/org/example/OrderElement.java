package org.example;

import java.math.BigDecimal;

public abstract class OrderElement<T> {
    protected ProductType productType;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public OrderElement(ProductType productType) {
        this.productType = productType;
    }

    public abstract BigDecimal getPrice();
    public abstract void setAmount(T amount);
}
