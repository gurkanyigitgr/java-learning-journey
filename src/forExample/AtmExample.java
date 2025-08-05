package forExample;

import java.util.Scanner;

public class AtmExample {
    public static void main(String[] args) {
        int bakiye = 1000, input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba GR BANK'a hoşgeldiniz :):):):):) ");
        System.out.println("Güncel Bakiyeniz : " + bakiye + "TL");

        while(bakiye > 9) {
            System.out.println("1. Bakiye Sorgula ");
            System.out.println("2. Para Yatır ");
            System.out.println("3. Para Çek ");
            System.out.println("4. Çıkış Yap ");
            System.out.println("Yapmak istediğiniz işlemi seçiniz : ");

            input = scan.nextInt();

            if(input == 1) {
                System.out.println("Güncel bakiyeniz : " + bakiye + "TL");
            }
            else if(input == 2) {
                System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                input = scan.nextInt();
                bakiye += input;
            }
            else if(input == 3) {
                System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                input = scan.nextInt();
                if(input > bakiye ) {
                    System.out.println("Geçersiz tutar girdiniz.");
                }else {
                    bakiye -= input;
                }
            }
            else if(input == 4) {
                System.out.println("Görüşmek üzere");
                break;
            }else {
                System.out.println("Geçersiz işlem girdiniz.");
            }
        }
    }
}
