package com.granovskiy.com.granovskiy;

public class Demo {
    public static void main(String[] args) {
        Person[] meet = new Person[] {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };

        Kata kata = new Kata();
        System.out.println(kata.outed(meet, "katie"));
    }
}
