package com.company.designpatternsexamples.structural.adapter.example1.builder;

/**
 * General interface for buildings
 *
 * @author eugenia
 */
interface Builder {

    /**
     * Builds a building
     *
     * @param location building location
     */
    void build(String location);

}
