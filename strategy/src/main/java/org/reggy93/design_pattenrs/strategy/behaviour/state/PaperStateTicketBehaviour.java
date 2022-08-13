package org.reggy93.design_pattenrs.strategy.behaviour.state;

import org.reggy93.design_pattenrs.strategy.entity.TicketStateIdentificationType;

/**
 * Implementation of {@link TicketStateIdentificationBehaviour} for paper ticket.
 */
public class PaperStateTicketBehaviour implements TicketStateIdentificationBehaviour {
    @Override
    public TicketStateIdentificationType retrieveTicketStateInformation() {
        return TicketStateIdentificationType.PAPER;
    }
}
