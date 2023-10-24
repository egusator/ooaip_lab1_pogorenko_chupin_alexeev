package org.example;

import java.util.List;

public class Courier {
    private Boolean isFree;
    private String name;
    private String phone;
    private List<Order> courierHistory;

    public void updateStatus(Order order) {
        //свич )
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
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

    public List<Order> getCourierHistory() {
        return courierHistory;
    }

    public void setCourierHistory(List<Order> courierHistory) {
        this.courierHistory = courierHistory;
    }

    public Courier(Boolean isFree, String name, String phone, List<Order> courierHistory) {
        this.isFree = isFree;
        this.name = name;
        this.phone = phone;
        this.courierHistory = courierHistory;
    }
}
