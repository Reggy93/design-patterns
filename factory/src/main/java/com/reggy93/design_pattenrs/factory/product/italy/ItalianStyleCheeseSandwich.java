package com.reggy93.design_pattenrs.factory.product.italy;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

/**
 * Represents product - italian type cheese sandwich.
 */
public class ItalianStyleCheeseSandwich extends Sandwich {

    public ItalianStyleCheeseSandwich() {
        this.name = "Italian Style Cheese Sandwich";
        this.base = "Pizza dough with topped yellow cheese and tomatoes";
        this.sauce = "Tomato sauce with garlic";
    }
}
