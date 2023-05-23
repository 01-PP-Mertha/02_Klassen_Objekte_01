package com.cc.java;

public class App {

    public static void main(String[] args) {

        /* Instanziierung Klasse --> Objekt */
        // Cat -- Referenztyp
        // cat -- Referenzvariable

        Cat cat1 = new Cat();
        cat1.tellYourAddress();
        System.out.println("Blick von aussen: " + cat1);

        System.out.println("------------------------");

        Cat cat2 = new Cat();
        cat2.tellYourAddress();
        System.out.println("Blick von aussen: " + cat2);

    }

    public void output(String outStr) {
        System.out.println(outStr);
    }

}
