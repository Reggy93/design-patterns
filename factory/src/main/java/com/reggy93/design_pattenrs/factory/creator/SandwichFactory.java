package com.reggy93.design_pattenrs.factory.creator;

import com.reggy93.design_pattenrs.factory.product.Sandwich;
import com.reggy93.design_pattenrs.factory.product.SandwichType;

/**
 * Abstract factory class for all sandwich factories containing common logic.
 */
public abstract class SandwichFactory {

    /**
     * Creates sandwich based on a passed type. Be created means gathering proper ingredients, assembling, cutting an
     * packing into a box.
     *
     * @param sandwichType {@link SandwichType} type of a sandwich
     * @return {@link Sandwich} fully prepared sandwich of a given type.
     */
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
