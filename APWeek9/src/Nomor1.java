
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
        System.out.println("Input :");
        System.out.print("Input jumlah bilangan = ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print("Input bilangan " + (i+1) + " = ");
            arr[i] = scan.nextInt();
        }
        System.out.printf("\nOutput :");
        int max = 0;
        int min = arr[0];
        double avg = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] > max){
                max = arr[i];
            }   
        }
        for (int i = 0; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            avg += arr[i];
        }
        avg /= size;
        System.out.printf("\nBilangan terbesar = %s",max);
        System.out.printf("\nBilangan terkecil = %s",min);
        System.out.printf("\nRata-rata = %s\n",avg);
    }
}
