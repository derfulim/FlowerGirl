package ua.training.model.entity.accessories;

import ua.training.model.entity.accessories.Accessory;

import java.math.BigDecimal;

public class DecoratingRibbon extends Accessory {
    private int length;

    public DecoratingRibbon(BigDecimal price, String name, String material, int length) {
        super(price, name, material);
        this.length = length;
    }
}
