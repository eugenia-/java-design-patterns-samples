package com.company.designpatternsexamples.structural.decorator.example2;

/**
 * @author eugenia
 */
 class WorkComputer extends ComputerDecorator{

    public WorkComputer(Computer computer) {
        super(computer);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print("Adding characteristics of a work computer. ");
    }
}
