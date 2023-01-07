package com.reggy93.design_pattenrs.factory.product;

import java.util.logging.Logger;

public abstract class Sandwich {

    private static final Logger LOG = Logger.getLogger("SandwichLogger");

    protected String name;

    protected String base;

    protected String sauce;

    public void prepare() {
        LOG.info(() -> "Preparing "  + name);
        LOG.info(() -> "Placing the base: " + base);
        LOG.info(() -> "Adding the sauce: " + sauce);
    }

    public void assemble() {
        LOG.info("Assembling all parts");
    }

    public void cut() {
        LOG.info("Cutting sandwich into 2 half");
    }

    public void box() {
        LOG.info("Placing the prepared sandwich in official SandwichStore box");
    }

    public String getName() {
        return name;
    }
}
