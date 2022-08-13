package org.reggy93.design_pattenrs.strategy.behaviour.state;

import org.reggy93.design_pattenrs.strategy.entity.TicketStateIdentificationType;

/**
 * Implementation of {@link TicketStateIdentificationBehaviour} for virtual/electronic ticket.
 */
public class VirtualStateTicketBehaviour implements TicketStateIdentificationBehaviour {

    @Override
    public TicketStateIdentificationType retrieveTicketStateInformation() {
        return TicketStateIdentificationType.VIRTUAL;
    }
}
