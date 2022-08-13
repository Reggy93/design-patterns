package org.reggy93.design_pattenrs.strategy.util;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Helps to log messages for tickets.
 */
public class MessageLoggerUtil {

    private MessageLoggerUtil() {
    }

    public static Supplier<String> logMessage(final String message, Object... parameters) {
        return () -> String.format("%s [%s]", message, Arrays.toString(parameters));
    }
}
