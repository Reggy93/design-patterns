package org.reggy93.design_pattenrs.common.service.execution;

import org.reggy93.design_pattenrs.common.util.DesignPatternType;

/**
 * Allows executing logic of a particular design pattern, retrieved from a registry.
 */
public interface DesignPatternExecutionService {

    /**
     * Retrieves a design pattern from registry and executes its logic.
     * This method can throw {@link IllegalArgumentException} when an appropriate design pattern was not found.
     *
     * @param designPatternType {@link DesignPatternType} to decide which design pattern logic should be executed
     */
    void executeDesignPatternLogic(DesignPatternType designPatternType);
}
