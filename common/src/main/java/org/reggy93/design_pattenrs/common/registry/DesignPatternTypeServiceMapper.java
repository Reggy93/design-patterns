package org.reggy93.design_pattenrs.common.registry;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_pattenrs.common.util.DesignPatternType;

import java.util.Optional;

/**
 * Registry for all implemented design patterns.
 */
public interface DesignPatternTypeServiceMapper {

    /**
     * Retrieves appropriate {@link DesignPatternService} based on passed {@link DesignPatternType} in order to
     * execute logic of a particular service.
     *
     * @param designPatternType {@link DesignPatternService} - to determine which design pattern should be returned
     * @return {@link DesignPatternService} implementation of a particular design pattern, or
     * {@link Optional#empty()} when such implementation was not found
     */
    Optional<DesignPatternService> retrieveMappedDesignPattern(DesignPatternType designPatternType);
}
