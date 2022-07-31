package org.reggy93.design_patterns.strategy.behaviour.state;

import org.reggy93.design_patterns.strategy.entity.TicketStateIdentificationType;

public class VirtualStateTicketBehaviour implements TicketStateIdentificationBehaviour {

    @Override
    public TicketStateIdentificationType retrieveTicketStateInformation() {
        return TicketStateIdentificationType.VIRTUAL;
    }
}
