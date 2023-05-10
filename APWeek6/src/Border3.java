
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
public class Border3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nilai x : ");
            x = s.nextInt();
            for (int i = 1; i <= x; i++) {
                for (int b = x; b >= 1; b--) {
                    if (i == 1 || b == x || i == x || b == 1) {
                        System.out.print("@");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }
            System.out.print("Apakah anda ingin lanjut (Y/N) : ");
            pilihan = s.next();
        }
    }
}
