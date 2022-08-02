package org.reggy93.design_pattenrs.strategy.behaviour.state;

import org.reggy93.design_pattenrs.strategy.entity.TicketStateIdentificationType;

public class PaperStateTicketBehaviour implements TicketStateIdentificationBehaviour {
    @Override
    public TicketStateIdentificationType retrieveTicketStateInformation() {
        return TicketStateIdentificationType.PAPER;
    }
}
