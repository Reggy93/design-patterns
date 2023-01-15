package com.reggy93.design_pattenrs.factory.product.poland;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - polish type meat sandwich.
 */
public class PolishStyleMeatSandwich extends Sandwich {

    public PolishStyleMeatSandwich() {
        this.name = "Polish Style Meat Sandwich";
        this.base = "Delicious rye bread with local ham";
        this.sauce = "Tomato sauce";
    }
}
