
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
public class Method7 {

    double angka;
    double angka1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Method7 t = new Method7();
        int menu = 0;
        System.out.print("Input angka : ");
        t.angka = scan.nextInt();
        t.angka1 = t.angka;
        System.out.println(" ");
        do {
            t.angka = t.angka1;
            System.out.println("Pilih operator");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Hasil akhir");
            do {
                System.out.print("Pilih : ");
                menu = scan.nextInt();
                if (menu < 1 || menu > 5) {
                    System.out.println("Menu tidak terdaftar!");
                }
            } while (menu < 1 || menu > 5);
            if (menu == 5) {
                System.out.println("Hasil akhir = " + t.angka1);
                break;
            } else if (menu != 5) {
                System.out.print("Masukkan angka = ");
                double oper = scan.nextDouble();
                if (menu == 1) {
                    t.tambah(t.angka, oper);
                }
                if (menu == 2) {
                    t.kurang(t.angka, oper);
                }
                if (menu == 3) {
                    t.kali(t.angka, oper);
                }
                if (menu == 4) {
                    t.bagi(t.angka, oper);
                }
            }
        } while (menu != 5);
    }

    public void tambah(double angka, double oper) {
        angka1 = angka + oper;
    }

    public void kurang(double angka, double oper) {
        angka1 = angka - oper;
    }

    public void kali(double angka, double oper) {
        angka1 = angka * oper;
    }

    public void bagi(double angka, double oper) {
        angka1 = angka / oper;
    }
}
