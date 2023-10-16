package org.example;

import java.math.BigDecimal;

public class WeightedOrderElement extends OrderElement<Double> {
        private Double weight;

    public WeightedOrderElement(ProductType productType) {
        super(productType);
    }

        @Override
        public BigDecimal getPrice() {
            return productType.getPricePerOne().multiply(BigDecimal.valueOf(weight));
        }

        @Override
        public void setAmount(Double amount) {
            this.weight = amount;
        }
}
