package arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[4];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for( int value : arr) {
            System.out.print(value + " ");
        }
    }
}
