package com.driver;

public class Main {
   public static void main(String[] args) {
        // Task 3: Create an object of RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Trying to access private variable directly
        // obj.name = "John"; // This will give a compile-time error
        // System.out.println(obj.name); // This will also give an error

        // Task 5: Using setter and getter methods
        obj.setName("John");
        System.out.println(obj.getName()); 
   }
}
