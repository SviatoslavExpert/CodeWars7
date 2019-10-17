package com.granovskiy;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.length() == 0 && lastName.length() == 0) return "";
        if (firstName.length() == 0 && lastName.length() > 0) return lastName;
        if (firstName.length() > 0 && lastName.length() == 0) return firstName;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println((new Dinglemouse("Clint", "Eastwood").getFullName()));
    }
}
