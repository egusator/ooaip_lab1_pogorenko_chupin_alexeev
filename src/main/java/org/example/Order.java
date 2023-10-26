package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private Courier courier;
    private Shop orderPoint;
    private BigDecimal totalPrice;
    private String address;
    private DeliveryStatus deliveryStatus;
    private PaymentMethod paymentMethod;
    private List<OrderElement> elements;

    public Order() {
    }

    public Order(String address, PaymentMethod paymentMethod, List<OrderElement> elements, Shop shop) {
        this.orderPoint = shop;
        this.address = address;
        this.paymentMethod = paymentMethod;
        this.totalPrice = BigDecimal.ZERO;
            elements = new ArrayList<>();
            deliveryStatus = DeliveryStatus.IN_PROCESS;
        this.elements = elements;
        for(OrderElement element: elements) {
            BigDecimal price = element.getPrice();
            this.totalPrice = this.totalPrice.add(price);
        }
        this.findCourier(shop);
    }

    public void addWeightedElement(ProductType type, Double weight) {
        WeightedOrderElement element = new WeightedOrderElement(type);
        element.setAmount(weight);
        elements.add(element);
        this.totalPrice = this.totalPrice.add(element.getPrice());
    }

    public void addPiecedElement(ProductType type, Integer quantity) {
        PiecedOrderElement element = new PiecedOrderElement(type);
        element.setAmount(quantity);
        elements.add(element);
        this.totalPrice = this.totalPrice.add(element.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(totalPrice, order.totalPrice) && Objects.equals(address, order.address) && deliveryStatus == order.deliveryStatus && paymentMethod == order.paymentMethod;
    }

    public void findCourier(Shop shop) {
        for (Courier courier: shop.getCouriers()) {
            if(courier.getFree()) {
                this.courier = courier;
                courier.setFree(false);
                courier.addOrder(this);
                this.setDeliveryStatus(DeliveryStatus.DELIVERY_IN_PROGRESS);
                break;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPrice, address, deliveryStatus, paymentMethod);
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Shop getOrderPoint() {
        return orderPoint;
    }

    public void setOrderPoint(Shop orderPoint) {
        this.orderPoint = orderPoint;
    }

    public List<OrderElement> getElements() {
        return elements;
    }

    public void setElements(List<OrderElement> elements) {
        this.elements = elements;
    }
}
