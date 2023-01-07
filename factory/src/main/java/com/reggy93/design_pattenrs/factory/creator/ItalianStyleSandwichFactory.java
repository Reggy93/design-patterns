package com.reggy93.design_pattenrs.factory.creator;

import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;
import com.reggy93.design_pattenrs.factory.product.italy.ItalianStyleCheeseSandwich;
import com.reggy93.design_pattenrs.factory.product.italy.ItalianStyleMeatSandwich;
import com.reggy93.design_pattenrs.factory.product.italy.ItalianStyleVeggieSandwich;

import java.util.logging.Logger;

public class ItalianStyleSandwichFactory extends SandwichFactory {

    private static final Logger LOG = Logger.getLogger("ItalianStyleSandwichFactory logger");
    @Override
    Sandwich createSandwich(final SandwichType sandwichType) {

        LOG.info(() -> String.format("Italian style sandwiches factory creating %s sandwich type", sandwichType));

        return switch (sandwichType) {
            case MEAT -> new ItalianStyleMeatSandwich();
            case CHEESE -> new ItalianStyleCheeseSandwich();
            case VEGGIE -> new ItalianStyleVeggieSandwich();
        };
    }
}
