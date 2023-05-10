
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
public class Nomor1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input N = ");
        int size = scan.nextInt();
        String arr[][] = new String[size][size];
        for (int i = 0; i < arr.length; i++) {
            //baris genap
            if (i == 0 || i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j % 2 != 0) {
                        arr[i][j] = "X";
                    } else {
                        arr[i][j] = "O";
                    }
                }
            }
            //baris ganjil
            if (i % 2 != 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (j % 2 != 0) {
                        arr[i][j] = "O";
                    } else {
                        arr[i][j] = "X";
                    }
                }
            }
        }
        //printer
        System.out.println("Output :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
