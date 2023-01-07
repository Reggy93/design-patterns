package com.reggy93.design_pattenrs.factory.creator;

import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;
import com.reggy93.design_pattenrs.factory.product.poland.PolishStyleCheeseSandwich;
import com.reggy93.design_pattenrs.factory.product.poland.PolishStyleMeatSandwich;
import com.reggy93.design_pattenrs.factory.product.poland.PolishStyleVeggieSandwich;

import java.util.logging.Logger;

public class PolishStyleSandwichFactory extends SandwichFactory {

    private static final Logger LOG = Logger.getLogger("PolishStyleSandwichFactory logger");

    @Override
    Sandwich createSandwich(final SandwichType sandwichType) {
        LOG.info(() -> String.format("Polish style sandwiches factory creating %s sandwich type", sandwichType));

        return switch (sandwichType) {
            case MEAT -> new PolishStyleMeatSandwich();
            case CHEESE -> new PolishStyleCheeseSandwich();
            case VEGGIE -> new PolishStyleVeggieSandwich();
        };
    }
}
