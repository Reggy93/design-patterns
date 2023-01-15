package com.reggy93.design_pattenrs.factory.product.italy;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - italian type meat sandwich.
 */
public class ItalianStyleMeatSandwich extends Sandwich {

    public ItalianStyleMeatSandwich() {
        this.name = "Italian Style Meat Sandwich";
        this.base = "Pizza dough with pepperoni, calms and olives";
        this.sauce = "Olive oil";
    }
}
