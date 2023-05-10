
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
public class Method9 {

    int min = 1000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Method9 t = new Method9();
        System.out.print("Input jumlah bilangan = ");
        int jumlah = scan.nextInt();
        int array[] = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            t.ambilInput(jumlah, array, i);
        }
        for (int i = 0; i < jumlah; i++) {
            t.cariMin(jumlah, array, i);
        }
        System.out.println(" ");
        System.out.println("Bilangan terkecil = " + t.min);
        System.out.println("Bilangan paling akhir = " + array[jumlah - 1]);
        System.out.print("Sebelum = ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i]);
            if (i != jumlah - 1) {
                System.out.print(", ");
            }
        }
        for (int i = 0; i < jumlah; i++) {
            t.ubahBilangan(jumlah, array, i);
        }
        System.out.println(" ");
        System.out.print("Sesudah = ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i]);
            if (i != jumlah - 1) {
                System.out.print(", ");
            }
        }
    }

    public int ambilInput(int jumlah, int[] array, int i) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input bilangan " + (i + 1) + " = ");
        array[i] = scan.nextInt();
        return array[i];
    }

    public void cariMin(int jumlah, int[] array, int i) {
        if (array[i] < min) {
            min = array[i];
        }
    }

    public int ubahBilangan(int jumlah, int[] array, int i) {
        if ((i + 1) % 2 == 0) {
            array[i] += min + array[jumlah - 1];
        }
        return array[i];
    }
}
