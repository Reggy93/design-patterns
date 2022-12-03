package org.reggy93.design_patterns.decorator.entity;

import java.math.BigDecimal;

/**
 * Common interface for all skateboard types.
 */
public interface Skateboard {

    /**
     * Gets the particular description (treat it as an identifier)
     *
     * @return description/identifier of the particular skateboard
     */
    String getDescription();

    /**
     * Gets price of the particular skateboard.
     *
     * @return price of the skateboard.
     */
    BigDecimal getPrice();
}
