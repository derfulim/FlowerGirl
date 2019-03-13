package ua.training.model.database;

import ua.training.model.SystemConstant;
import ua.training.model.entity.flowers.Flower;
import ua.training.model.entity.flowers.GardenFlower;
import ua.training.model.entity.flowers.WildFlower;

import java.math.BigDecimal;

public enum Flowers implements SystemConstant {

    CORNFLOWER(new WildFlower(productsBundle.getString("cornflower.name"),30, BigDecimal.valueOf(5),12, Colour.BLUE, Area.FIELD)),
    POPPY(new WildFlower(productsBundle.getString("poppy.name"),30, BigDecimal.valueOf(10),12, Colour.RED, Area.FIELD)),
    SNOWDROP(new WildFlower(productsBundle.getString("snowdrop.name"),15, BigDecimal.valueOf(10),12, Colour.WHITE, Area.FORREST)),
    ORCHID(new WildFlower(productsBundle.getString("orchid.name"),35, BigDecimal.valueOf(20),12, Colour.PURPLE, Area.TROPIC)),
    ROSE(new GardenFlower(productsBundle.getString("rose.name"), 55, BigDecimal.valueOf(30),10 ,Colour.RED, "Hard")),
    TULIP(new GardenFlower(productsBundle.getString("tulip.name"), 25, BigDecimal.valueOf(20),18 ,Colour.YELLOW, "Little")),
    NARCISSUS(new GardenFlower(productsBundle.getString("narcissus.name"), 25, BigDecimal.valueOf(20),18 ,Colour.YELLOW, "Medium")),
    PEONY(new GardenFlower(productsBundle.getString("peony.name"), 30, BigDecimal.valueOf(20),10 ,Colour.PINK, "Medium"))
    ;
    private Flower flower;

    Flowers(Flower flower) {
        this.flower = flower;
    }

    public Flower getFlower() {
        return flower;
    }
}
