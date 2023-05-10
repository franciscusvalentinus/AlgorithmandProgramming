
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
public class HitungUmur {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tanggal lahir ");
        int tanggal = scan.nextInt();
        System.out.print("Masukkan bulan lahir ");
        int bulan = scan.nextInt();
        System.out.print("Masukkan tahun lahir ");
        int tahun = scan.nextInt();
        int tanggaln = 27;
        int bulann = 9;
        int tahunn = 2019;
        System.out.println("");
        if (bulan<bulann){
            System.out.println("Jadi umur anda " + (tahunn-tahun) + " tahun");
        }
        else if (bulan==bulann){
            if (tanggal<tanggaln || tanggaln==tanggal){
                System.out.println("Jadi umur anda " + (tahunn-tahun) + " tahun");
            }
            else {
                System.out.println("Jadi umur anda " + (tahunn-tahun-1) + " tahun");
            }
        }
        else {
            System.out.println("Jadi umur anda " + (tahunn-tahun-1) + " tahun");
        }
    }
}
