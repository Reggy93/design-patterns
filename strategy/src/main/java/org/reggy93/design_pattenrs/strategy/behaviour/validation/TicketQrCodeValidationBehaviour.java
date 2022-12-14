package org.reggy93.design_pattenrs.strategy.behaviour.validation;

import org.reggy93.design_pattenrs.strategy.entity.TicketValidationType;

/**
 * Implementation of {@link TicketValidationBehaviour} for QR code scanning.
 */
public class TicketQrCodeValidationBehaviour implements TicketValidationBehaviour {

    @Override
    public TicketValidationType retrieveTicketValidationType() {
        return TicketValidationType.QR_CODE;
    }
}
