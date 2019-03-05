package ua.training.model;

import java.math.BigDecimal;

public class Fragrance extends Flower {
    public Fragrance(int stemLength, String name, BigDecimal price, int freshness) {
        super(stemLength, name, price, freshness);
    }
    Fragrance f = new Fragrance(1,"", new BigDecimal(1),5);
}

