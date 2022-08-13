package org.reggy93.design_pattenrs.strategy.behaviour.validation;

import org.reggy93.design_pattenrs.strategy.entity.TicketValidationType;

/**
 * Allows defining validation behaviour - QR code scanning or manual validation.
 */
public interface TicketValidationBehaviour {

    /**
     * Retrieves ticket validation type.
     *
     * @return {@link TicketValidationType} for a ticket.
     */
    TicketValidationType retrieveTicketValidationType();
}
