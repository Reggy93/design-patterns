package com.reggy93.design_pattenrs.factory.product.poland;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - polish type veggie sandwich.
 */
public class PolishStyleVeggieSandwich extends Sandwich {

    public PolishStyleVeggieSandwich() {
        this.name = "Polish Style Veggie Sandwich";
        this.base = "Delicious rye bread with salad, red pepper and onion";
        this.sauce = "Tomato sauce";
    }
}
