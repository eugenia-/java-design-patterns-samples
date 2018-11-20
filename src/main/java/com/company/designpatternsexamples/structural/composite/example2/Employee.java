package com.company.designpatternsexamples.structural.composite.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * The class forms a group of employees, it has a list of Employee within it,
 * this is our group of objects that we want to target as a single object.
 *
 * @author eugenia
 */
class Employee {

    private String name;
    private String position;
    private int wage;
    private List<Employee> coworkers;

    Employee(String name, String position, int wage) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        coworkers = new ArrayList<Employee>();
    }

    public void addCoworker(Employee employee) {
        coworkers.add(employee);
    }

    public void removeCoworker(Employee employee) {
        coworkers.remove(employee);
    }

    public List<Employee> getCoworkers() {
        return coworkers;
    }

    public String toString() {
        return "Employee : | Name: " + name + ", Position: " + position + ", Wage: " + wage + " |";
    }
}
