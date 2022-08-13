package org.reggy93.design_pattenrs.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Maps design patterns names with its types.
 */
public enum DesignPatternType {

    OBSERVER("observer"),
    STRATEGY("strategy");

    private final String value;

    DesignPatternType(String value) {
        this.value = value;
    }

    public static DesignPatternType fromString(final String text) {

        for (DesignPatternType b : DesignPatternType.values()) {
            if (StringUtils.equals(b.value, text)) {
                return b;
            }
        }
        throw new IllegalArgumentException(String.format("%s [%s] %s", "Passed design pattern type:", text, "not " +
                "supported!"));
    }
}
