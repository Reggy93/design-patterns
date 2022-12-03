package org.reggy93.design_patterns.decorator.configurator;

import org.reggy93.design_patterns.decorator.entity.Skateboard;

import java.math.BigDecimal;

/**
 * Enhances skateboard with bottom graphics.
 */
public class BottomGraphicsSkateBoardEnhancer extends AbstractSkateboardEnhancer {

    public BottomGraphicsSkateBoardEnhancer(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    @Override
    public String getDescription() {
        return this.skateboard.getDescription() + "+Enhance skateboard with bottom graphics";
    }

    @Override
    public BigDecimal getPrice() {
        return this.skateboard.getPrice().add(BigDecimal.valueOf(10.25));
    }
}
