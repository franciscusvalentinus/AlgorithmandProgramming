
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Kuis2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input :");
        System.out.print("Harga : ");
        double harga = scan.nextInt();
        System.out.print("Bunga (%) : ");
        double bunga = scan.nextInt();
        System.out.print("Jumlah bulan : ");
        int jBulan = scan.nextInt();
        for (int i = 1; i <= jBulan; i++) {
            harga = harga + ((bunga/100) * harga);
        }
        System.out.println("Output : " + (int) harga);
    }
}
