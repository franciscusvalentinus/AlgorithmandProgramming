
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
public class Pattern2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan nilai x : ");
            x = s.nextInt();
            for (int i = 0; i < x; i++) {
                for (int b = x; b > i; b--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("+");
                }
                System.out.println("");
            }
            for (int i = 0; i < x; i++) {
                for (int b = x + 1; b > 0; b--) {
                    System.out.print(" ");
                }
                for (int j = x; j > i; j--) {
                    System.out.print("+");
                }
                for (int b = 0; b <= i; b++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            System.out.print("Apakah anda ingin lanjut (Y/N) : ");
            pilihan = s.next();
        }
    }
}
