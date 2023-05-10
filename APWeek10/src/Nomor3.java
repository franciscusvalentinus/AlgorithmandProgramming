
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
public class Nomor3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N = ");
        int size = scan.nextInt();
        int[][] arr = new int[size][size];
        int angka = 1;
        if (size % 2 == 0) {
            angka = 2;
        }
        System.out.println("Output :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i < arr.length - 1) {
                    arr[i][j] = angka;
                    System.out.print(arr[i][j] + "\t");
                    angka += 2;
                } else {
                    for (int k = arr.length - 1; k >= 0; k--) {
                        arr[i][j] += arr[k][j];
                    }
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
}
