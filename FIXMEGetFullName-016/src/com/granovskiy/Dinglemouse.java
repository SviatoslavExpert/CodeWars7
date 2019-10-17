package com.granovskiy;

public class Dinglemouse {
    private String firstName;
    private String lastName;
    //private String fullName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        System.out.println((new Dinglemouse("Clint", "Eastwood").getFullName()));
    }
}
