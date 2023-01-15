package com.reggy93.design_pattenrs.factory.product.poland;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - polish type cheese sandwich.
 */
public class PolishStyleCheeseSandwich extends Sandwich {

    public PolishStyleCheeseSandwich() {
        this.name = "Polish Style Cheese Sandwich";
        this.base = "Delicious rye bread with local yellow cheese and onion";
        this.sauce = "Tomato sauce";
    }
}
