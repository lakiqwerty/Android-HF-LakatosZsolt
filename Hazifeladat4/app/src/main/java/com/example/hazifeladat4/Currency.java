package com.example.hazifeladat4;

public class Currency {
    private String name;
    private double buyRate;
    private double sellRate;
    private int flagResId;

    public Currency(String name, double buyRate, double sellRate, int flagResId) {
        this.name = name;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.flagResId = flagResId;
    }

    public String getName() {
        return name;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public int getFlagResId() {
        return flagResId;
    }
}


