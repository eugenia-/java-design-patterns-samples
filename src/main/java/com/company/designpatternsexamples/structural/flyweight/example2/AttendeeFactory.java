package com.company.designpatternsexamples.structural.flyweight.example2;

import java.util.HashMap;

/**
 * @author eugenia
 */
class AttendeeFactory {

    private static final HashMap<String, Attendee> attendees = new HashMap();

    /**
     * the method creates a new AttendeeImpl object if none already exist. On the other hand, if it does exist,
     * the method gets the attendee from {@link this#attendees} and returns it.
     *
     * @param name
     * @return {@link Attendee}
     */
    public static Attendee getAttendee(String name) {
        AttendeeImpl attendeeImpl = (AttendeeImpl) attendees.get(name);
        if (attendeeImpl == null) {
            attendeeImpl = new AttendeeImpl(name);
            attendees.put(name, attendeeImpl);
            System.out.println("Creating a new attendee: " + name);
        }
        return attendeeImpl;
    }
}
