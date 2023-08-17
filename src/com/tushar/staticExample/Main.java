package com.tushar.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Tushar = new Human(20, "Tushar singh", 1000, false);
//        Human Rahul = new Human(34, "Rahul", 1500, true);
//        Human arpit = new Human(34, "arpit", 1500, true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);


    }
    // this is not dependent on objects.
    static void fun() {
//        greeting(); // you cant use this because it requires an instance.
        // but the function you are using it in does not depend on object.

        // you cannot access non-static stuff without referencing their instances in a static context.
        // hence, here i am referencing it.
        Main obj = new Main();
        obj.greeting();
    }

    // we know that something which is not static, belongs to an object.
    void greeting() {
        System.out.println("Hello World");
    }

}
