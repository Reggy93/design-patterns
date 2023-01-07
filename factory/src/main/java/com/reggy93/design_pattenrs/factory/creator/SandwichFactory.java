package com.reggy93.design_pattenrs.factory.creator;

import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;

public abstract class SandwichFactory {

    public Sandwich orderSandwich(SandwichType sandwichType) {

        final Sandwich sandwich = createSandwich(sandwichType);

        sandwich.prepare();
        sandwich.assemble();
        sandwich.cut();
        sandwich.box();

        return sandwich;
    }

    abstract Sandwich createSandwich(SandwichType sandwichType);
}
