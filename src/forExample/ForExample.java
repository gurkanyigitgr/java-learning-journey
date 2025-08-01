package forExample;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        int input;
        boolean isPrime = true;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Please enter a positive number: ");
            input = scan.nextInt();
        }while (input < 2);

        for(int i = 2; i <input ; i++){
            if(input % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print("The number you entered: " + input + " is prime.");
        } else {
            System.out.print("The number you entered: " + input + " is not prime.");
        }
    }
}
