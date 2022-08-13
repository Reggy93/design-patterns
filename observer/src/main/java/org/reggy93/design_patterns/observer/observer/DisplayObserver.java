package org.reggy93.design_patterns.observer.observer;

/**
 * Implemented by all observers - contains the method that signalises to call a subject for new set of data.
 */
public interface DisplayObserver {

    /**
     * Called by subject, updates the data, when called from
     * {@link org.reggy93.design_patterns.observer.subject.Subject}.
     */
    void update();
}
