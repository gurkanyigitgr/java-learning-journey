package oop;

public class Calculator {
    public int num1;
    public int num2;
    public String color;

    Calculator(int num1, int num2, String color){
        this.num1 = num1;
        this.num2 = num2;
        this.color = color;
    }

    public int addition() {
        return this.num1 + this.num2;
    }

    public int subtraction(){
        return this.num1 - this.num2;
    }

    public int multiplication(){
        return this.num1 * this.num2;
    }

    public int division(){
        return this.num1 / this.num2;
    }
}
