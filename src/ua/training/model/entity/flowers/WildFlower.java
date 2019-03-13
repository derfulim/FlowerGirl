package ua.training.model.entity.flowers;

import ua.training.model.database.Area;
import ua.training.model.database.Colour;
import ua.training.model.entity.flowers.Flower;

import java.math.BigDecimal;

public class WildFlower extends Flower {

    private Area area;

    public WildFlower(String name, int stemLenght, BigDecimal price, int freshness, Colour colour, Area area) {
        super(name,stemLenght, price, freshness,colour);
        this.area = area;
    }

}
