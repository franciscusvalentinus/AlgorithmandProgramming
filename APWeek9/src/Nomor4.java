
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
public class Nomor4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int akhir = 0;
        System.out.println("Input :");
        System.out.print("Input jumlah bilangan = ");
        int size = scan.nextInt();
        System.out.println(" ");
        int[] arr = new int[size];
        for (int a = 0; a < size; a++) {
            System.out.print("Input bilangan " + (a + 1) + " = ");
            arr[a] = scan.nextInt();
            if (a == 0) {
                min = arr[a];
            }
            if (a == size - 1) {
                akhir = arr[a];
            }
            if (arr[a] < min) {
                min = arr[a];
            }
        }
        System.out.println(" ");
        System.out.println("Output :");
        System.out.print("Bilangan terkecil = ");
        System.out.println(min);
        System.out.print("Bilangan paling akhir = ");
        System.out.println(akhir);
        System.out.print("Sebelum = ");
        for (int a = 0; a < size; a++) {
            System.out.print(arr[a]);
            if (arr[a] != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print("Sesudah = ");
        for (int a = 0; a < size; a++) {
            if ((a + 1) % 2 != 0) {
                System.out.print(arr[a]);
                if (a != size - 1) {
                    System.out.print(", ");
                }
            }
            if ((a + 1) % 2 == 0) {
                arr[a] = arr[a] + min + akhir;
                System.out.print(arr[a]);
                if (a != size - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("");
    }
}