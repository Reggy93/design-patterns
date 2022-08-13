package org.reggy93.design_pattenrs.strategy.entity;

/**
 * Represents a ticket validation type.
 */
public enum TicketValidationType {
  /**
   * Validation for QR code scanning.
   */
  QR_CODE,
  /**
   * Manudal validation - reading data on ticket
   */
  DATA_ON_TICKET
}
