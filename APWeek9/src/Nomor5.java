
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franciscusvalentinus
 */
public class Nomor5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan urutan angka : ");
        String angka = scan.next();
        String angka2 = angka.replace("0", "");
        System.out.println("Output");
        System.out.print(angka2);
        int z = angka.length() - angka2.length();
        for (int i = 1; i <= z; i++) {
            System.out.print("0");
        }
        System.out.println("");
    }
}
