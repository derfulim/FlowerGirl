package ua.training.model;

import java.math.BigDecimal;

public abstract class Flower implements Product {

    protected int stemLength;
    protected String name;
    protected BigDecimal price;
    protected int freshness;

    public Flower(int stemLength, String name, BigDecimal price, int freshness) {
        this.stemLength = stemLength;
        this.name = name;
        this.price = price;
        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public BigDecimal getPrice() {return price;}

}
