package org.reggy93.design_patterns.decorator.entity;

import java.math.BigDecimal;

public class Longboard implements Skateboard {

    @Override
    public String getDescription() {
        return "This is Longboard skateboard";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(35.80);
    }
}
