package ua.training.model.entity.bouquets;

import ua.training.model.SystemConstant;
import ua.training.model.entity.flowers.Flower;
import ua.training.model.entity.Product;
import ua.training.model.entity.accessories.Accessory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Product, SystemConstant {

    private String name;
    private BigDecimal price;
    private List<Flower> flowers;
    private List<Accessory> accessories;
    private List<Product> products;

    public Bouquet(String name, List<Flower> flowers, List<Accessory> accessories) {
        this.name = name;
        this.flowers = flowers;
        this.accessories = accessories;

        products = new ArrayList<>();
        products.addAll(flowers);
        products.addAll(accessories);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {

        price  = BigDecimal.valueOf(0);

        for (Product product:products) {
            price = price.add(product.getPrice());
        }
        return price;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append(messagesBundle.getString("output.bouquet.created") + getName() + "\n");
        sb.append(messagesBundle.getString("output.bouquet.content") + "\n");

        for (Product product:products) {
            sb.append(product.toString() + "\n");
        }

        sb.append(messagesBundle.getString("output.bouquet.price") + getPrice());
        return sb.toString();
    }
}
