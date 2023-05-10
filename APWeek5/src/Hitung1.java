
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
public class Hitung1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /***
         * LEAUGE OF LEGENDS
         */
        System.out.print("Masukkan sebuah angka ");
        int x = scan.nextInt();
        int total = 0;
        for (int i = 1; i <= x; i++) {
            if (i == x) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    total = total - i;
                } else {
                    System.out.print(i);
                    total = total + i;
                }
            } else {
                if (i % 2 == 0) {
                    System.out.print(i + "+");
                    total = total - i;
                } else {
                    System.out.print(i + "-");
                    total = total + i;
                }
            }
        }
        System.out.println("=" + total);
    }
}
