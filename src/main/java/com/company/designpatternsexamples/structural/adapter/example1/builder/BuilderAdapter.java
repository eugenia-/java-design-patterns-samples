package com.company.designpatternsexamples.structural.adapter.example1.builder;

/**
 * General interface that will be used by client
 *
 * @author eugenia
 */
interface BuilderAdapter {

    /**
     * Build method
     *
     * @param location building location
     */
    void build(String location);
}
