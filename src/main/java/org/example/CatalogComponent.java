package org.example;

public abstract class CatalogComponent {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatalogComponent(String name) {
        this.name = name;
    }
}
