/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franciscusvalentinus
 */
public class NewClass {

    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    public static void main(String[] args) {

        NewClass fungsi = new NewClass();
        int pilih;
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("========::IMT UC::========");
            System.out.println("||||||SELAMAT DATANG||||||");
            System.out.println("========:Yuk Main:========");
            System.out.println("=> Total Mahasiswa: " + fungsi.listMahasiswa.size());
            System.out.println("==========================");
            System.out.println("1. Masukkan data mahasiswa");
            System.out.println("2. Lihat data mahasiswa");
            System.out.println("3. Hapus data mahasiswa");
            System.out.println("4. Keluar");
            System.out.println("|========================|");
            System.out.print(" -> Pilihan menu: ");
            pilih = scan.nextInt();

            if (pilih == 1) {
                fungsi.TambahMahasiswa();
            }
            if (pilih == 2) {
                fungsi.tampilanMahasiswa();
            }
            if (pilih == 3) {
                fungsi.hapusMahasiswa();
            }
            if (pilih == 4) {
                fungsi.Keluar();
                break;
            }
        }
    }

    public void TambahMahasiswa() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("======================");
        System.out.println("|||TAMBAH MAHASISWA|||");
        System.out.println("======================");
        System.out.println("data mahasiswa");
        System.out.println("masukkan nama :");
        String nama = scan.nextLine();
        System.out.println("Masukkan NIM :");
        String nim = scan.nextLine();
        listMahasiswa.add(new Mahasiswa(nama, nim));
    }

    public void tampilanMahasiswa() {
        System.out.println();
        System.out.println("======================");
        System.out.println("|||LIST MAHASISWA|||");
        System.out.println("======================");
        for (int i = 0; i < listMahasiswa.size(); i++) {
            System.out.println(i + 1 + ". " + listMahasiswa.get(i).getNama() + " - " + listMahasiswa.get(i).getNim());
        }
    }

    public void hapusMahasiswa() {
        System.out.println();
        System.out.println("======================");
        System.out.println("|||LIST MAHASISWA|||");
        System.out.println("======================");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < listMahasiswa.size(); i++) {
            System.out.println(i + 1 + ". " + listMahasiswa.get(i).getNama() + " - " + listMahasiswa.get(i).getNim());
        }
        System.out.println("hapus nomor berapa");
        int del = scan.nextInt();

        try {
            listMahasiswa.remove(del - 1);
        } catch (Exception e) {
            System.out.println("(-) INPUTAN TIDAK SESUAI DENGAN DATA YANG EXIST (-)");
            System.out.println();
        }
    }

    public void Keluar() {
        System.out.println(" Thank you for playing!");
        System.out.println("Nama: Franciscus Valentinus Ongkosianbhadra - NIM: 0706011910004");
    }

}