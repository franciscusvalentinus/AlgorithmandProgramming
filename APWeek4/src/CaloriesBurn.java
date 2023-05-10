
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franciscusvalentinus
 */
public class CaloriesBurn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung kalori yang terbakar");
        System.out.println("<=============================>");
        System.out.print("Masukkan berat badan (kg) ");
        int berat = scan.nextInt();
        System.out.println("Pilih aktivitas yang dilakukan :");
        System.out.println("1. Lari");
        System.out.println("2. Bersepeda");
        System.out.println("3. Berenang");
        System.out.println("4. Berjalan");
        int aktivitas = scan.nextInt();
        System.out.print("Berapa lama ? (menit) ");
        int lama = scan.nextInt();
        int mets = 0;
        switch (aktivitas) {
            case 1:
                mets = 10;
                break;
            case 2:
                mets = 8;
                break;
            case 3:
                mets = 10;
                break;
            case 4: 
                mets = (int) 3.5;
                break;
            default: 
                System.out.println("pilih menu 1-4 saja");
                break;
        }
        double kalori = 0.175*mets*berat*lama;
        System.out.println("Jadi kalori yang terbakar adalah " + kalori + " kalori");
    }
}