
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
public class HitungKPR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menghitung KPR");
        System.out.println("<============>");
        System.out.print("Masukkan harga rumah ");
        long hargaRumah = scan.nextLong();
        //tipe data yang lebih besar adalah long
        //sepulang technocamp
        //pelajari lagi
        //uts semakin dekat
        System.out.println("Pilih tipe cicilan yang diinginkan ");
        System.out.println("1. 5 tahun");
        System.out.println("2. 10 tahun");
        System.out.println("3. 15 tahun");
        int tipeCicilan = scan.nextInt();
        System.out.print("Apakah anda sudah menikah ? (y/n) ");
        String menikah = scan.next();
        int anak = 0;
        double bunga;
        long totalHarga = 0;
        if (menikah.equalsIgnoreCase("y")){
            System.out.print("Masukkan jumlah anak ");
            anak = scan.nextInt();
        }
        System.out.print("Masukkan gaji per bulan ");
        long gaji = scan.nextLong();
        long dp = (long) (hargaRumah * 0.1);
        double bulan1;
        double bulan2;
        double bulan3;
        double cicilan;
        long cicilanMaksimum = 0;
        double sisaCicilan;
        double totalSisaCicilan = 0;
        switch (tipeCicilan) {
            case 1:
                bunga = hargaRumah * 0.03;
                totalHarga = (long) (bunga + hargaRumah);
                bulan1 = 5 * 12;
                cicilan = (totalHarga - dp) / (bulan1);
                if (menikah.equalsIgnoreCase("y")) {
                    if (anak == 0) {
                        cicilanMaksimum = (long) (gaji * 0.25);
                    } else if (anak > 0 && anak < 3) {
                        cicilanMaksimum = (long) (gaji * 0.20);
                    } else {
                        cicilanMaksimum = (long) (gaji * 0.15);
                    }
                } else {
                    cicilanMaksimum = (long) (gaji * 0.3);
                }
                if (cicilan > cicilanMaksimum) {
                    sisaCicilan = cicilan - cicilanMaksimum;
                    totalSisaCicilan = sisaCicilan*bulan1;
                }
                break;
            case 2:
                bunga = hargaRumah * 0.05;
                totalHarga = (long) (bunga + hargaRumah);
                bulan2 = 10 * 12;
                cicilan = (totalHarga - dp) / (bulan2);
                if (menikah.equalsIgnoreCase("y")) {
                    if (anak == 0) {
                        cicilanMaksimum = (long) (gaji * 0.25);
                    } else if (anak > 0 && anak < 3) {
                        cicilanMaksimum = (long) (gaji * 0.20);
                    } else {
                        cicilanMaksimum = (long) (gaji * 0.15);
                    }
                } else {
                    cicilanMaksimum = (long) (gaji * 0.3);
                }
                if (cicilan > cicilanMaksimum) {
                    sisaCicilan = cicilan - cicilanMaksimum;
                    totalSisaCicilan = sisaCicilan*bulan2;
                }
                break;
            case 3:
                bunga = hargaRumah * 0.08;
                totalHarga = (long) (bunga + hargaRumah);
                bulan3 = 15 * 12;
                cicilan = (totalHarga - dp) / (bulan3);
                if (menikah.equalsIgnoreCase("y")) {
                    if (anak == 0) {
                        cicilanMaksimum = (long) (gaji * 0.25);
                    } else if (anak > 0 && anak < 3) {
                        cicilanMaksimum = (long) (gaji * 0.20);
                    } else {
                        cicilanMaksimum = (long) (gaji * 0.15);
                    }
                } else {
                    cicilanMaksimum = (long) (gaji * 0.3);
                }
                if (cicilan > cicilanMaksimum) {
                    sisaCicilan = cicilan - cicilanMaksimum;
                    totalSisaCicilan = sisaCicilan*bulan3;
                }
        }
        long totaldp = (long) (dp + totalSisaCicilan);
        System.out.println("");
        System.out.println("Jadi total harga rumahnya adalah " + totalHarga + " Rupiah");
        System.out.println("Jadi cicilan per bulannya adalah " + cicilanMaksimum + " Rupiah");
        System.out.println("Jadi uang mukanya adalah " + totaldp + " Rupiah");
    }
}
