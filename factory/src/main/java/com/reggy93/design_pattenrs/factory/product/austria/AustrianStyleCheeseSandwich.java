package com.reggy93.design_pattenrs.factory.product.austria;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - austrian type cheese sandwich.
 */
public class AustrianStyleCheeseSandwich extends Sandwich {

    public AustrianStyleCheeseSandwich() {
        this.name = "Austrian Style Cheese Sandwich";
        this.base = "Wheat bread with local cheddar";
        this.sauce = "Ketchup";
    }
}
