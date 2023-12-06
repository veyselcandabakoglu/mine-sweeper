import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row,column;

        System.out.println("Mayın Tarlasına Hoşgeldiniz.");
        System.out.println("Lütfen Oynamak İstediğiniz Boyutları Giriniz.");
        System.out.print("Satır Sayısı: ");
        row = input.nextInt();
        System.out.print("Sütun Sayısı: ");
        column = input.nextInt();

        input.close();
        
        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}
