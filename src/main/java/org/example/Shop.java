package org.example;


import java.time.LocalDateTime;
import java.util.List;

public class Shop {
    private String name;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private String address;
    private Catalog catalog;
    private List<Courier> couriers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Shop(String name, LocalDateTime beginTime, LocalDateTime endTime, String address, Catalog catalog) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.address = address;
        this.catalog = catalog;
    }
}
