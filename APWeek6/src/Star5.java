
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
public class Star5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("Y")) {
            do {
                System.out.print("Masukkan nilai x : ");
                x = s.nextInt();
            } while (x % 2 == 0);{
            System.out.println("Masukkan ganjil");
        }
            int j = 1;
            for (int i = (x - 1) / 2; i < x; i++) {
                for (j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                for (int b = x; b > i + 1; b--) {
                    System.out.print(" ");
                }
                for (int b = x; b > i + 1; b--) {
                    System.out.print(" ");
                }
                for (j = 2; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = (x + 1) / 2; i < x; i++) {
                for (j = x; j > i; j--) {
                    System.out.print("*");
                }
                for (int b = 3; b <= i; b++) {
                    System.out.print(" ");
                }
                for (int b = 3; b <= i; b++) {
                    System.out.print(" ");
                }
                for (j = x; j > i; j--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("Apakah anda ingin lanjut (Y/N) : ");
            pilihan = s.next();
        }
    }
}
