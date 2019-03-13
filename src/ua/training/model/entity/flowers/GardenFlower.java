package ua.training.model.entity.flowers;

import ua.training.model.database.Colour;
import ua.training.model.entity.flowers.Flower;

import java.math.BigDecimal;

public class GardenFlower extends Flower {

    private String care;

    /**
     * @param care - Describes the care and conditions that a particular flower needs,
     * may include, for example, temperature and humidity values.
     */
    public GardenFlower(String name, int stemLength, BigDecimal price, int freshness, Colour colour, String care) {
        super(name, stemLength, price, freshness, colour);
        this.care = care;
    }
}
