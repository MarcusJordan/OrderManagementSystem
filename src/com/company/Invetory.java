package com.company;

import java.util.HashMap;

public class Invetory {

    private HashMap<Item,Integer> items;

    public Invetory() {
        items = new HashMap<>();
    }

    public void add(Item item, int qty){
        items.replace(item, qty);

        if(items.containsKey(item))
            items.replace(item, qty);
        else
            items.put(item, qty);

    }

    public void delete(Item item) {
        items.remove(item);
    }

    public Invetory(HashMap<Item, Integer> items) {
        this.items = items;
    }

    public boolean contains(Item key){
        return items.containsKey(key);
    }

    @Override
    public String toString() {
        return "Invetory{" +
                "items=" + items +
                '}';
    }
}
