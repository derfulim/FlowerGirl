package ua.training.model.entity.accessories;

import ua.training.model.SystemConstant;
import ua.training.model.entity.Product;
import ua.training.view.TextConstant;

import java.math.BigDecimal;

public abstract class Accessory implements Product, SystemConstant, TextConstant {
    private BigDecimal price;
    private String name;
    private String material;

    public Accessory(BigDecimal price, String name, String material) {
        this.price = price;
        this.name = name;
        this.material = material;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + RIGHT_BRACKET + messagesBundle.getString(PRICE) + getPrice()+ LEFT_BRACKET;
    }
}
