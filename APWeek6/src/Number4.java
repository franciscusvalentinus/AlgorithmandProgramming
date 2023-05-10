
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
public class Number4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan nilai x : ");
            x = s.nextInt();
            int j = 1;
            for (int i = 0; i < x; i++) {
                for (int b = x; b > i; b--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i + 1; j++) {
                    System.out.print(j);
                }
                for (int k = j - 2; k >= 1; k--) {
                    System.out.print(k);
                }
                System.out.println("");
            }
            for (int i = 1; i < x; i++) {
                for (int b = 0; b <= i; b++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= x - i; k++) {
                    System.out.print(k);
                }
                for (j = x - i - 1; j > 0; j--) {
                    System.out.print(j);
                }
                System.out.println("");
            }
            System.out.println("Apakah anda ingin lanjut (Y/N) : ");
            pilihan = s.next();
        }
    }
}
