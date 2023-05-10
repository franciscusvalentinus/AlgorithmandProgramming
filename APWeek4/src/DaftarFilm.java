
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
public class DaftarFilm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("List film XXI yang dapat ditonton");
        System.out.println("<===============================>");
        System.out.print("Masukkan tanggal lahir ");
        int tanggal = scan.nextInt();
        System.out.print("Masukkan bulan lahir ");
        int bulan = scan.nextInt();
        System.out.print("Masukkan tahun lahir ");
        int tahun = scan.nextInt();
        int tanggaln = 27;
        int bulann = 9;
        int tahunn = 2019;
        int umur;
        System.out.println("");
        if (bulan<bulann){
            umur = tahunn-tahun;
            System.out.println("Jadi umur anda " + umur + " tahun");
        }
        else if (bulan==bulann){
            if (tanggal<tanggaln || tanggaln==tanggal){
                umur = tahunn-tahun;
                System.out.println("Jadi umur anda " + umur + " tahun");
            }
            else {
                umur = tahunn-tahun-1;
                System.out.println("Jadi umur anda " + umur + " tahun");
            }
        }
        else {
            umur = tahunn-tahun-1;
            System.out.println("Jadi umur anda " + umur + " tahun");
        }
        /*
        PEMBATAS
        */
        if (umur >= 17){
            System.out.println("Semua film dapat ditonton");
        }
        else if (umur >= 13){
            System.out.println("Film yang dapat ditonton :");
            System.out.println("DANUR 3: SUNYARURI");
            System.out.println("THE ZOYA FACTOR");
            System.out.println("AD ASTRA");
            System.out.println("HAYYA: THE POWER OF LOVE 2");
            System.out.println("AD ASTRA (IMAX2D)");
            System.out.println("PRETTY BOYS");
            System.out.println("WARKOP DKI REBORN");
            System.out.println("GUNDALA");
            System.out.println("47  METERS DOWN: UNCAGED");
        }
        else {
            System.out.println("Belum cukup umur");
            System.out.println("Minimal harus berusia 13 tahun untuk nonton");
        }
    }
}
