package org.reggy93.design_pattenrs.strategy.behaviour.validation;

import org.reggy93.design_pattenrs.strategy.entity.TicketValidationType;

public class TicketDataOnTicketValidationBehaviour implements TicketValidationBehaviour {
    @Override
    public TicketValidationType retrieveTicketValidationType() {
        return TicketValidationType.DATA_ON_TICKET;
    }
}
