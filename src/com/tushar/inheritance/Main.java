package com.tushar.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(2, 4, 5);
//        Box box2 = new Box(box);

//        System.out.println(box.l + " " + box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 6);
        System.out.println(box5.h);

        // there are many variables in both parent and child class
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // but here, when the obj itself is of type parent class, how will you call the constructor
        // this is why error

//        BoxWeight box6 = new box(2, 4, 5);
//        System.out.println(Box6);



    }
}
