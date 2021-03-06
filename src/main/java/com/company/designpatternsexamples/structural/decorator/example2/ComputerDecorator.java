package com.company.designpatternsexamples.structural.decorator.example2;

/**
 * @author eugenia
 */
class ComputerDecorator implements Computer {

    protected Computer computer;

    public ComputerDecorator(Computer computer) {
        this.computer = computer;
    }


    public void assemble() {
        this.computer.assemble();
    }
}
