
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
public class Method8 {

    double max = 0;
    double min = 1000;
    double total = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Method8 t = new Method8();
        System.out.print("Input jumlah bilangan = ");
        int jumlah = scan.nextInt();
        int array[] = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            t.ambilInput(jumlah, array, i);
        }
        for (int i = 0; i < jumlah; i++) {
            t.cariMax(jumlah, array, i);
        }
        for (int i = 0; i < jumlah; i++) {
            t.cariMin(jumlah, array, i);
        }
        for (int i = 0; i < jumlah; i++) {
            t.rata(jumlah, array, i);
        }
        System.out.println(" ");
        System.out.println("Bilangan terbesar = " + (int) t.max);
        System.out.println("Bilangan terkecil = " + (int) t.min);
        System.out.println("Rata-rata = " + (double) (t.total / jumlah));
    }

    public int ambilInput(int jumlah, int[] array, int i) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input bilangan " + (i + 1) + " = ");
        array[i] = scan.nextInt();
        return array[i];
    }

    public void cariMax(int jumlah, int[] array, int i) {
        if (array[i] > max) {
            max = array[i];
        }
    }

    public void cariMin(int jumlah, int[] array, int i) {
        if (array[i] < min) {
            min = array[i];
        }
    }

    public void rata(int jumlah, int[] array, int i) {
        total += array[i];
    }
}
