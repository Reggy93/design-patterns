package com.reggy93.design_pattenrs.factory.creator;

import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;
import com.reggy93.design_pattenrs.factory.product.austria.AustrianStyleCheeseSandwich;
import com.reggy93.design_pattenrs.factory.product.austria.AustrianStyleMeatSandwich;
import com.reggy93.design_pattenrs.factory.product.austria.AustrianStyleVeggieSandwich;

import java.util.logging.Logger;

public class AustrianStyleSandwichFactory extends SandwichFactory {

    private static final Logger LOG = Logger.getLogger("AustrianStyleSandwichFactory logger");
    @Override
    Sandwich createSandwich(final SandwichType sandwichType) {

        LOG.info(() -> String.format("Austrian style sandwiches factory creating %s sandwich type", sandwichType));
        return switch (sandwichType) {
            case MEAT -> new AustrianStyleMeatSandwich();
            case CHEESE -> new AustrianStyleCheeseSandwich();
            case VEGGIE -> new AustrianStyleVeggieSandwich();
        };
    }
}
