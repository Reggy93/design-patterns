package org.reggy93.design_patterns.strategy.behaviour.validation;

import org.reggy93.design_patterns.strategy.entity.TicketValidationType;

public class TicketQrCodeValidationBehaviour implements TicketValidationBehaviour {

    @Override
    public TicketValidationType retrieveTicketValidationType() {
        return TicketValidationType.QR_CODE;
    }
}
