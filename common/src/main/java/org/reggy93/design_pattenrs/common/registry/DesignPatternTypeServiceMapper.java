package org.reggy93.design_pattenrs.common.registry;

import org.reggy93.design_pattenrs.common.service.design_pattern.DesignPatternService;
import org.reggy93.design_pattenrs.common.util.DesignPatternType;

import java.util.Optional;

public interface DesignPatternTypeServiceMapper {

    Optional<DesignPatternService> retrieveMappedDesignPattern(DesignPatternType designPatternType);
}
