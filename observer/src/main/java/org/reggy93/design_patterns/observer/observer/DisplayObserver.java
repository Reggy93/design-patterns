package org.reggy93.design_patterns.observer.observer;

public interface DisplayObserver {

    /**
     * Updates the data, when retrieved from {@link org.reggy93.design_patterns.observer.subject.Subject}.
     */
    void update();
}
