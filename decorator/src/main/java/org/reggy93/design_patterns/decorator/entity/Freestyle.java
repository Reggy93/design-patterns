package org.reggy93.design_patterns.decorator.entity;

import java.math.BigDecimal;

public class Freestyle implements Skateboard {

    @Override
    public String getDescription() {
        return "This is Freestyle skateboard";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(15.30);
    }
}
