
import java.util.Random;
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
public class Random8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int jawaban = random.nextInt(99);
        int angka;
        System.out.println("Mulai tebak angka ");
        do {
            System.out.print("Masukkan angka 1-99 : ");
            angka = scan.nextInt();
            if (angka == 0) {
                System.out.println("Jawabannya adalah " + jawaban);
                break;
            }
            if (angka == jawaban) {
                System.out.println("Anda benar " + jawaban);
            }
            if (angka < jawaban) {
                System.out.println("Angka anda terlalu kecil");
            }
            if (angka > jawaban) {
                System.out.println("Angka anda terlalu besar");
            }
        } while (angka != jawaban);
        System.out.println("Thank you");
    }
}
