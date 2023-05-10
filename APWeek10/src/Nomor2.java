
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
public class Nomor2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N = ");
        int size = scan.nextInt();
        int arr[][] = new int[size][size];
        //input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Input (" + i + "," + j + ") = ");
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Output :");
        System.out.print("Diagonalnya : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == i) {
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.print(" dan ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == size - 1) {
                    System.out.print(arr[i][j]);
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
