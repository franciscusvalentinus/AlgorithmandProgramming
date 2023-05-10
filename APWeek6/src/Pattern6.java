
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
public class Pattern6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        String pilihan = "y";
        while (pilihan.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan nilai x : ");
            x = s.nextInt();
            System.out.print("Masukkan nilai y : ");
            y = s.nextInt();
            for (int i = 1; i <= y; i++) {
                //looping baris
                for (int j = 1; j <= x; j++) {
                    //looping kesamping (objek)
                    if (j % 2 == 0) {
                        System.out.print(".");
                    }
                    if (j % 2 != 0) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
            System.out.println("Apakah anda ingin lanjut (Y/N) : ");
            pilihan = s.next();
        }
    }
}
