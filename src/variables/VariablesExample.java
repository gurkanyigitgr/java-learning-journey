package variables;

import java.util.Scanner;

public class VariablesExample {
    public static void main(String[] args) {
        int quizNotu, vizeNotu, finalNotu;
        double ortalama ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Quiz notunuzu giriniz : ");
        quizNotu = scan.nextInt();
        System.out.print("Vize notunuzu giriniz : ");
        vizeNotu = scan.nextInt();
        System.out.print("Final notunuzu giriniz : ");
        finalNotu = scan.nextInt();

        ortalama = (quizNotu * 0.2) + (vizeNotu * 0.3)  + (finalNotu * 0.5);
        System.out.println("Ortalamanız : " + ortalama);
    }
}
