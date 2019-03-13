package ua.training.model.database;

import ua.training.model.SystemConstant;
import ua.training.model.entity.accessories.Accessory;
import ua.training.model.entity.accessories.DecoratingRibbon;
import ua.training.model.entity.accessories.Wrapper;

import java.math.BigDecimal;

public enum Accessories implements SystemConstant {
    SATIN_RIBBON(new DecoratingRibbon( BigDecimal.valueOf(4),productsBundle.getString("satin.ribbon.name"), "Satin", 10)),
    PACK_PAPER(new Wrapper(BigDecimal.valueOf(6),productsBundle.getString("pack.paper.name"), "Paper", Colour.WHITE));

    private Accessory accessory;
    Accessories(Accessory accessory) {
        this.accessory=accessory;
    }

    public Accessory getAccessory() {
        return accessory;
    }
}
