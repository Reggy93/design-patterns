package com.reggy93.design_pattenrs.factory.product.italy;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - italian type veggie sandwich.
 */
public class ItalianStyleVeggieSandwich extends Sandwich {

    public ItalianStyleVeggieSandwich() {
        this.name = "Italian Style Veggie Sandwich";
        this.base = "Pizza dough with green and black olives";
        this.sauce = "Tomato sauce";
    }
}
