package games;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {
        int can = 5, i=0;
        int tahmin,sayi;

        int[] tahminler = new int[can];


        boolean oyunDurum = false;


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        sayi = rand.nextInt(100);
        System.out.println(sayi);
        System.out.println("Sayı tahmini oyununa hoşgeldiniz ");
        System.out.println("Tahmin etmeniz gereken sayı 0 ile 99 arasında :)");


        while (can > 0) {
            tahmin = scan.nextInt();
            tahminler[i++] = tahmin;


            if(tahmin <0 || tahmin > 99) {
                System.out.println("Lütfen 0 ile 99 arasında bir sayı giriniz !!!");
                continue;
            }

            if(tahmin == sayi) {
                oyunDurum = true;
                break;
            }else {
                System.out.println("Yanlış tahminde bulundunuz :(");
                System.out.println("Kalan can " + --can);
            }
        }

        if(oyunDurum) {
            System.out.println("DOĞRU TAHMİN TEBRİKLERRRRR");
        }else {
            System.out.println("Oyun bitti maalesef kaybettiniz :/");
        }

        System.out.print("Tahminler: ");
        for( int value : tahminler ){
            if(value != 0) {
            System.out.print(value +  ", ");
            }
        }



    }
}
