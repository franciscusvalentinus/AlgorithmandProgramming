
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
public class AdvGaji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan berapa banyak jam kerja dalam seminggu ");
        int y = scan.nextInt();
        System.out.println("Masukkan berapa banyak gaji/jam (rupiah) ");
        int x = scan.nextInt();
        //catatan dari Farhan
        //lebih baik pake integer (jangan pake double)
        int l = 0;
        int z = 0;
        if (y > 40) {
            l = (int) ((y-40) * 1.5 * x);
            z = (l + x * 40);
            if (z < 4000000){
                int x1 = (int) ((l + x * 40) * 0.95);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
            if (z >= 4000000 && z <= 8000000){
                int x1 = (int) ((l + x * 40) * 0.925);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
            if (z > 8000000){
                int x1 = (int) ((l + x * 40) * 0.9);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
        }
        if (y <= 40){
            l = 0;
            z = (l + x * y);
            if (z < 4000000){
                int x1 = (int) ((l + x * y) * 0.95);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
            if (z >= 4000000 &&z <= 8000000){
                int x1 = (int) ((l + x * y) * 0.925);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
            if (z > 8000000){
                int x1 = (int) ((l + x * y) * 0.9);
                int x2 = (int) (x1 * 0.98);
                System.out.println("Gaji yang diterima " + x2);
            }
        }
    }
}