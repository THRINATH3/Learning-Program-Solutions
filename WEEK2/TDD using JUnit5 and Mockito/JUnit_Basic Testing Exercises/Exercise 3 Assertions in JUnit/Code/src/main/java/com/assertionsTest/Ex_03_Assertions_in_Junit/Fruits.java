package com.assertionsTest.Ex_03_Assertions_in_Junit;
import java.util.ArrayList;
import java.util.List;

public class Fruits {
    private List<String> fruits = new ArrayList<>();

    public void addFruit(String fruitName) {
        fruits.add(fruitName);
    }

    public boolean containsFruit(String name) {
        return fruits.contains(name);
    }

    public int count() {
        return fruits.size();
    }

    public String getFruit(int index) {
    	if(index > fruits.size()) return null;
        return fruits.get(index);
    }
}
