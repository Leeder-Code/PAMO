package com.example.bmi_calculator;

public class Item {
    private String name;
    private boolean isPurchased;

    public Item(String name) {
        this.name = name;
        this.isPurchased = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
    }
}
