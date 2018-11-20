package com.company.designpatternsexamples.structural.flyweight.example2;

import java.util.Random;

/**
 * @author eugenia
 */
public class Main {

    private static final String[] names = {"David", "Scott", "Andrew", "Rhett"};

    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i) {
            AttendeeImpl attendeeImpl = (AttendeeImpl) AttendeeFactory.getAttendee(getRandomName());
            attendeeImpl.setAge(getRandomAge());
            attendeeImpl.listenToConcert();
        }
    }

    private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }

    private static int getRandomAge() {
        return (int)(Math.random()*80);
    }
}
