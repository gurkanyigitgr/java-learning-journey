package games.Minesweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Mayın Tarlasına hoşgeldiniz...");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.print("Satır Sayısı : ");
        row = scan.nextInt();
        System.out.print("Sütun Sayısı: ");
        col = scan.nextInt();
        Minesweeper mine = new Minesweeper(row,col);

        mine.run();
    }
}
