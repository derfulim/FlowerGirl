package ua.training.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Product {

    BigDecimal price;
    List<Flower> flowers;
    List<Accessory> accessories;

    @Override
    public BigDecimal getPrice() {
//        for (Flower flower:flowers) {
//            price = price.add(flower.getPrice());
//        }
//        for (Accessory accessory:accessories
//             ) {price.add(accessory.getPrice());
//        }

        List<Product> products = new ArrayList<>();
        products.addAll(flowers);
        products.addAll(accessories);
        for (Product product:products) {
            price = price.add(product.getPrice());
        }
        return price;
    }
}
