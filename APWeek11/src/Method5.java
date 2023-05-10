
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
public class Method5 {

    long cicil;
    long DP;
    long bunga;
    int bulan;

    public static void main(String[] args) {
        Method5 t = new Method5();
        Scanner scan = new Scanner(System.in);
        long harga = t.getInput("Harga rumah : ");
        System.out.println("Tipe Cicilan:");
        System.out.println("1. 5 tahun");
        System.out.println("2. 10 tahun");
        System.out.println("3. 15 tahun");
        int tipe = t.getInput("Pilih tipe cicilan : ");
        if (tipe == 1) {
            t.bulan = 60;
        } else if (tipe == 2) {
            t.bulan = 120;
        } else if (tipe == 2) {
            t.bulan = 180;
        }
        t.hitungBunga(tipe, harga);
        System.out.print("Menikah (Y/T) : ");
        String menikah = scan.next();
        int anak = t.getInput("Jumlah Anak : ");
        int gaji = t.getInput("Gaji per bulan : ");
        t.hitungCicilanMaksimum(gaji, menikah, anak);
        long total = harga + t.bunga;
        t.hitungMinimumDP(total, t.cicil);
        System.out.println(" ");
        System.out.println("Output:");
        System.out.println("Total Harga = " + total);
        System.out.println("Cicilan per bulan = " + t.cicil);
        System.out.println("Uang Muka = " + t.DP);
    }

    public int getInput(String label) {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        int input = scan.nextInt();
        return input;
    }

    public long hitungBunga(int tipe, long harga) {
        if (tipe == 1) {
            bunga = (long) (0.03 * harga);
        } else if (tipe == 2) {
            bunga = (long) (0.05 * harga);
        } else if (tipe == 3) {
            bunga = (long) (0.08 * harga);
        }
        return bunga;
    }

    public long hitungCicilanMaksimum(int gaji, String menikah, int anak) {
        if (menikah.equalsIgnoreCase("t")) {
            cicil = (long) (0.3 * gaji);
        } else if (menikah.equalsIgnoreCase("y")) {
            if (anak == 0) {
                cicil = (long) (0.25 * gaji);
            } else if (anak > 0 && anak < 3) {
                cicil = (long) (0.2 * gaji);
            } else if (anak >= 3) {
                cicil = (long) (0.15 * gaji);
            }
        }
        return cicil;
    }

    public double hitungMinimumDP(long total, long cicil) {
        System.out.println(total);
        System.out.println(cicil);
        DP = total - (cicil * bulan);
        return DP;
    }
}
