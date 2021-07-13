package org.launchcode.thymeleafexamples.models;

public class Student {
    String firstName;
    String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInitials() {
        return this.firstName.substring(0,1) + "." + this.lastName.substring(0,1) + ".";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
