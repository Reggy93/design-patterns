package com.reggy93.design_pattenrs.factory.product.austria;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - austrian type veggie sandwich.
 */
public class AustrianStyleVeggieSandwich extends Sandwich {

    public AustrianStyleVeggieSandwich() {
        this.name = "Austrian Style Veggie Sandwich";
        this.base = "Wheat bread with salad, dried tomatoes and pepper";
        this.sauce = "Mustard sauce";
    }
}
