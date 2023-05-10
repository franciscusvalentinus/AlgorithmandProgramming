
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
        System.out.println("Input :");
        System.out.print("Input jumlah bilangan = ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        System.out.println("");
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Input bilangan " + (i + 1) + " = ");
                arr[i] = scan.nextInt();
                arr2[i] = arr[i];
            } while (arr[i] > 1000);
        }
        System.out.println("");
        System.out.print("Jumlah geser = ");
        int g = scan.nextInt();
        int test = arr[0];
        System.out.println("");
        System.out.println("Output :");
        System.out.print("Sebelum : ");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("");
        System.out.print("Sesudah : ");
        for (int i = 0; i < size; i++) {
            if (i + g < size) {
                arr2[i + g] = arr[i];
            }
            if (i + g >= size) {
                arr2[i + g - size] = arr[i];
            }
        }

        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println("");
    }
}
