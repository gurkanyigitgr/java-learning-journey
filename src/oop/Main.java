package oop;

public class Main {
    public static void main(String[] args) {
        // constructor
        Calculator m1 = new Calculator(10,5, "Black");

        int division = m1.division();
        int multiplication = m1.multiplication();
        int addition = m1.addition();
        int subtraction = m1.subtraction();
        System.out.println(subtraction);

        Calculator m2 = new Calculator(20,5,"Blue");

        System.out.println(m2.division());
    }
}
