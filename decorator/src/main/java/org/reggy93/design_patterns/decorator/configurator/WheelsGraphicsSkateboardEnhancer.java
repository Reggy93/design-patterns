package org.reggy93.design_patterns.decorator.configurator;

import org.reggy93.design_patterns.decorator.entity.Skateboard;

import java.math.BigDecimal;

/**
 * Enhances skateboard with wheels graphics.
 */
public class WheelsGraphicsSkateboardEnhancer extends AbstractSkateboardEnhancer {

    public WheelsGraphicsSkateboardEnhancer(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    @Override
    public String getDescription() {
        return this.skateboard.getDescription() + "+Enhance skateboard with wheels graphics";
    }

    @Override
    public BigDecimal getPrice() {
        return this.skateboard.getPrice().add(BigDecimal.valueOf(4.65));
    }
}
