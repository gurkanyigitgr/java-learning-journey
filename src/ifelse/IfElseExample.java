package ifelse;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        int a,b,operation, result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: : ");
        a = scan.nextInt();
        System.out.print("Enter second number: : ");
        b = scan.nextInt();
        System.out.println("Select operation : ");
        System.out.println("1-Addition 2-Subtraction 3-Multiplication 4-Division");
        operation = scan.nextInt();

        if(operation==1){
            result = a+b;
        }else if(operation==2){
            result = a-b;
        }else if(operation==3){
            result = a*b;
        }else if(operation==4){
            if(b == 0 || a == 0) {
                System.out.println("Division by zero is not allowed !!!");
            }
            result = a / b;
        }else {
            System.out.println("Invalid operation selected -__-");
        }

        System.out.println("Your answer : " + result);
    }
}
