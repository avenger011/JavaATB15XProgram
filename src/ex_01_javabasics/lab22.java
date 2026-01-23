package ex_01_javabasics;

public class lab22 {
    static class Person {
        String name;
        int age;

        // 1. Default (No-Argument) Constructor
        Person() {
            this.name = "Unknown";
            this.age = 0;
            System.out.println("Default constructor called");
        }

        // 2. Parameterized Constructor with one argument
        Person(String name) {
            this.name = name;
            this.age = 0;
            System.out.println("One-parameter constructor called");
        }

        // 3. Parameterized Constructor with two arguments
        Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Two-parameter constructor called");
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
     }


        public static void main(String[] args) {
            // Create objects using different constructors
            Person p1 = new Person();              // Calls default


            Person p2 = new Person("Alice");       // Calls one-parameter
            Person p3 = new Person("Bob", 30);     // Calls two-parameter

            p1.display();
            p2.display();
            p3.display();
        }
    }

