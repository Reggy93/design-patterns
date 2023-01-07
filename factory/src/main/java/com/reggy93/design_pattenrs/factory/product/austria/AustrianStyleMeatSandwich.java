package com.reggy93.design_pattenrs.factory.product.austria;

import com.reggy93.design_pattenrs.factory.product.Sandwich;

public class AustrianStyleMeatSandwich extends Sandwich {

    public AustrianStyleMeatSandwich() {
        this.name = "Austrian Style Meat Sandwich";
        this.base = "Wheat bread with local bacon";
        this.sauce = "Mustard sauce";
    }
}
