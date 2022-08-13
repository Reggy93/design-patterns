package org.reggy93.design_pattenrs.strategy.behaviour.validation;

import org.reggy93.design_pattenrs.strategy.entity.TicketValidationType;

/**
 * Implementation of {@link TicketValidationBehaviour} for reading data on ticket.
 */
public class TicketDataOnTicketValidationBehaviour implements TicketValidationBehaviour {
    @Override
    public TicketValidationType retrieveTicketValidationType() {
        return TicketValidationType.DATA_ON_TICKET;
    }
}
