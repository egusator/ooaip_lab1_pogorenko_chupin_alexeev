package org.example;

import java.util.List;

public class Category extends CatalogComponent {
    private List<CatalogComponent> components;

    public Category(List<CatalogComponent> components, String name) {
        super(name);
        this.components = components;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public List<CatalogComponent> getComponents() {
        return components;
    }

    public void setComponents(List<CatalogComponent> components) {
        this.components = components;
    }
}
