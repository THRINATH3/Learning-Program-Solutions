package com.AAApattern.Ex_04_AAAPatternTeardownMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Fruits {
    private List<String> fruits = new ArrayList<>();

    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public String getFruit(int index) {
        if (index >= 0 && index < fruits.size()) {
            return fruits.get(index);
        }
        return null;
    }

    public int getTotalFruits() {
        return fruits.size();
    }

    public void clearBasket() {
        fruits.clear();
    }
}