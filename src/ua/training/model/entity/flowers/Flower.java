package ua.training.model.entity.flowers;

import ua.training.model.SystemConstant;
import ua.training.model.database.Colour;
import ua.training.model.entity.Product;
import ua.training.view.TextConstant;

import java.math.BigDecimal;

public abstract class Flower implements Product, SystemConstant, TextConstant {

    private int stemLength;
    private String name;
    private BigDecimal price;
    private int freshness;
    private Colour colour;

    /**
     * @param freshness - Represents the number of hours elapsed since the flower was cut.
     */
    public Flower(String name, int stemLength, BigDecimal price, int freshness, Colour colour) {
        this.name = name;
        this.stemLength = stemLength;
        this.price = price;
        this.freshness = freshness;
        this.colour = colour;
    }

    public int getStemLength() {

        return stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString() {
        return getName() +WORD_SEPARATOR + RIGHT_BRACKET + messagesBundle.getString(PRICE) + getPrice() + WORD_SEPARATOR +
                messagesBundle.getString(FRESHNESS) + getFreshness() + WORD_SEPARATOR +
        messagesBundle.getString(STEM_LENGTH)+ getStemLength() + LEFT_BRACKET;
    }

    @Override
    public BigDecimal getPrice() {return price;}

    @Override
    public String getName() {
        return name;
    }
}
