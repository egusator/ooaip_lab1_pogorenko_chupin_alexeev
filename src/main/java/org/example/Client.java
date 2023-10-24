package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private String phone;
    private List<Order> clientHistory;

    public void makeOrder(String address, PaymentMethod paymentMethod, Shop shop, List<OrderElement> elements) {
        Order order = new Order(address, paymentMethod, elements, shop);
        clientHistory.add(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Client(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.clientHistory = new ArrayList<>();
    }
}
