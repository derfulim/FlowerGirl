package ua.training.model;

import java.math.BigDecimal;

public class Accessory implements Product {
    protected BigDecimal price;
    protected String name;


    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
