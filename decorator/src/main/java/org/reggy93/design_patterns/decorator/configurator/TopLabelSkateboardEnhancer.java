package org.reggy93.design_patterns.decorator.configurator;

import org.reggy93.design_patterns.decorator.entity.Skateboard;

import java.math.BigDecimal;

/**
 * Enhances skateboard with top label.
 */
public class TopLabelSkateboardEnhancer extends AbstractSkateboardEnhancer {

    public TopLabelSkateboardEnhancer(Skateboard skateboard) {
        this.skateboard = skateboard;
    }

    @Override
    public String getDescription() {
        return this.skateboard.getDescription() + "+Enhance skateboard with top label";
    }

    @Override
    public BigDecimal getPrice() {
        return this.skateboard.getPrice().add(BigDecimal.valueOf(6.75));
    }
}
