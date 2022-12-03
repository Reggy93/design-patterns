package org.reggy93.design_patterns.decorator.entity;

import java.math.BigDecimal;

public class Downhill implements Skateboard {

    @Override
    public String getDescription() {
        return "This is Downhill skateboard";
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(20.50);
    }
}
