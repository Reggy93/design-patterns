package org.reggy93.design_patterns.decorator.entity;

import java.math.BigDecimal;

public class Street implements Skateboard {

    @Override
    public String getDescription() {
        return "This is Street skateboard";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(12.40);
    }
}
