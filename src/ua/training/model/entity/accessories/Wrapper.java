package ua.training.model.entity.accessories;

import ua.training.model.database.Colour;
import ua.training.model.entity.accessories.Accessory;

import java.math.BigDecimal;

public class Wrapper extends Accessory {
    private Colour colour;
    public Wrapper(BigDecimal price, String name, String material, Colour colour) {
        super(price, name, material);
        this.colour = colour;
    }
}
