
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
public class Method10 {

    public static void main(String[] args) {
        Method10 t = new Method10();
        int[][] array1 = new int[2][3];
        int[] array2 = new int[3];
        int[] array3 = new int[2];
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 3; b++) {
                t.getInput1(array1, a, b);
            }
        }
        System.out.println(" ");
        for (int a = 0; a < 3; a++) {
            t.getInput2(array2, a);
        }
        for (int a = 0; a < 2; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(array1[a][b]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int a = 0; a < 3; a++) {
            System.out.println(a);
        }
        for (int a = 0; a < 2; a++) {
            t.kali(array1, array2, array3, a);
        }
        System.out.print("Perhitungan: ");
        for (int a = 0; a < 2; a++) {
            System.out.println(array3[a]);
            System.out.print("             ");
        }
    }

    public int getInput1(int array1[][], int a, int b) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai array1 [" + (a + 1) + "][" + (b + 1) + "] : ");
        array1[a][b] = scan.nextInt();
        return array1[a][b];
    }

    public int getInput2(int array2[], int a) {
        System.out.print("Masukkan nilai array2 [" + (a + 1) + "][1] : ");
        Scanner scan = new Scanner(System.in);
        array2[a] = scan.nextInt();
        return array2[a];
    }

    public int kali(int array1[][], int array2[], int array3[], int a) {
        for (int i = 0; i < 3; i++) {
            array3[a] += array1[a][i] * array2[i];
        }
        return array3[a];
    }
}
