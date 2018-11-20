package com.company.designpatternsexamples.structural.flyweight.example2;

/**
 * @author eugenia
 */
class AttendeeImpl implements Attendee {

    private String name;
    private int age;

    public AttendeeImpl(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void listenToConcert() {
        System.out.println(name + " is listening to concert " + age + " years old!");
    }
}
