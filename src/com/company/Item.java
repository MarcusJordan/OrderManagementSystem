package com.company;

import java.util.List;

public class Item {
    private Long id;
    private double price;
    private String name;
    private String description;
    private List<String> tags;

    public Item(long id, double price, String name, String description, List<String> tags) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
        this.tags = tags;
    }
    public double getPrice() {
        return price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;

        if(!(obj instanceof Item)) return false;

        Item item = (Item) obj;

        return this.getId().equals(((Item) obj).getId());
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }

    @Override
    public int hashCode() {
        return this.getId().hashCode();
    }
}
