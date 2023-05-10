
import java.util.Arrays;
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
        System.out.println("Input :");
        System.out.print("Input jumlah bilangan = ");
        int size = scan.nextInt();
        System.out.println(" ");
        int[] arr = new int[size];
        for (int a = 0; a < size; a++) {
            System.out.print("Input bilangan " + (a + 1) + " = ");
            arr[a] = scan.nextInt();
        }
        System.out.println(" ");
        System.out.println("Output :");
        System.out.print("Sebelum = ");
        for (int a = 0; a < size; a++) {
            System.out.print(arr[a]);
            if (a != size - 1) {
                System.out.print(", ");
            }
        }
        Arrays.sort(arr);
        System.out.println(" ");
        System.out.println("Sesudah =");
        System.out.print("Kecil ke besar = ");
        for (int a = 0; a < size; a++) {
            System.out.print(arr[a]);
            if (a != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print("Besar ke kecil = ");
        for (int a = size - 1; a >= 0; a--) {
            System.out.print(arr[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}