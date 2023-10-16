package org.example;

import java.math.BigDecimal;

public class PiecedOrderElement extends OrderElement<Integer> {
    private Integer quantity;

    public PiecedOrderElement(ProductType productType) {
        super(productType);
    }

    @Override
    public BigDecimal getPrice() {
        return productType.getPricePerOne().multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public void setAmount(Integer amount) {
        this.quantity = amount;
    }
}
