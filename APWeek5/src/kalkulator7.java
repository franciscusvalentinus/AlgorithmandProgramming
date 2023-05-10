
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
public class kalkulator7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka pertama = ");
        int angka = scan.nextInt();
        int total = angka;
        while (true) {
            System.out.println("1.Tambah");
            System.out.println("2.Kurang");
            System.out.println("3.Kali");
            System.out.println("4.Bagi");
            System.out.println("5.Hasil ahkir");
            System.out.print("Pilih: ");
            int pilihan = scan.nextInt();
            if (pilihan == 1) {
                System.out.print("Masukkan angka = ");
                int y = scan.nextInt();
                total = total + y;
            }
            if (pilihan == 2) {
                System.out.print("Masukkan angka = ");
                int y = scan.nextInt();
                total = total - y;
            }
            if (pilihan == 3) {
                System.out.print("Masukkan angka = ");
                int y = scan.nextInt();
                total = total * y;
            }
            if (pilihan == 4) {
                System.out.print("Masukkan angka = ");
                int y = scan.nextInt();
                total = total / y;
            }
            if (pilihan == 5) {
                System.out.print("Hasil akhir = " + total);
                break;
            }
        }
        System.out.println("");
    }
}
