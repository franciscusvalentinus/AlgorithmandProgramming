/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author franciscusvalentinus
 */
public class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
}
