package com.tushar.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
   static long population;

   static void message() {
       System.out.println("Hello World");
   //    System.out.println(this.age);// uh cant use it,from static uh cant use non static stuff
   }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
