package ua.training.model.services.build;

import ua.training.model.SystemConstant;
import ua.training.model.database.Accessories;
import ua.training.model.database.Flowers;
import ua.training.model.entity.accessories.Accessory;
import ua.training.model.entity.bouquets.Bouquet;
import ua.training.model.entity.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class SimpleBouquetBuilder extends BouquetBuilder implements SystemConstant {

    @Override
    public Bouquet makeBouquet() {
        List <Flower> flowers = new ArrayList<>();
        for (Flowers flower:Flowers.values()
             ) {flowers.add(flower.getFlower());
        }

        List<Accessory> accessories = new ArrayList<>();
        for (Accessories accessory: Accessories.values()) {
            accessories.add(accessory.getAccessory());
        }

        return new Bouquet(productsBundle.getString("simple.bouquet.name"),flowers,accessories);
    }
}
