package org.reggy93.design_pattenrs.strategy.behaviour.state;

import org.reggy93.design_pattenrs.strategy.entity.TicketStateIdentificationType;

/**
 * Allows defining ticket state behaviour - paper or virtual/electronic.
 */
public interface TicketStateIdentificationBehaviour {

    /**
     * Retrieves ticket state behaviour.
     *
     * @return {@link TicketStateIdentificationType} for a ticket
     */
    TicketStateIdentificationType retrieveTicketStateInformation();
}
