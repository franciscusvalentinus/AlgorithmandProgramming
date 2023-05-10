
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
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][1];
        int result[][] = new int[2][1];

        for (int i = 0; i < arr1.length; i++) {//baris
            for (int j = 0; j < arr1[i].length; j++) {//kolom
                System.out.println("Matrix A (" + i + "," + j + ") =");
                arr1[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr2.length; i++) {//baris
            for (int j = 0; j < arr2[i].length; j++) {//kolom
                System.out.println("Matrix B (" + i + "," + j + ") =");
                arr2[i][j] = scan.nextInt();
            }
        }

        result[0][0] = (arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0]) + (arr1[0][2] * arr2[2][0]);
        result[1][0] = (arr1[1][0] * arr2[0][0]) + (arr1[1][1] * arr2[1][0]) + (arr1[1][2] * arr2[2][0]);
        //output
        System.out.println("");
        System.out.println("Matrix A (2x3)");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matrix B (3x1)");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Hasil perkalian Matrix (2x1)");
        System.out.println(result[0][0]);
        System.out.println(result[1][0]);
    }
}
