package org.example;

import java.math.BigDecimal;

public class ProductType extends CatalogComponent {
    private BigDecimal pricePerOne;

    public ProductType(String name, BigDecimal pricePerOne) {
        super(name);
        this.pricePerOne = pricePerOne;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public BigDecimal getPricePerOne() {
        return pricePerOne;
    }

    public void setPricePerOne(BigDecimal pricePerOne) {
        this.pricePerOne = pricePerOne;
    }
}
