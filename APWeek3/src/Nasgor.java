
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
public class Nasgor {
    public static void main(String[] args) {
        int min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan stok nasi putih (gram) ");
        int nasiPutih = scan.nextInt();
        int porsiNasiPutih = nasiPutih/200;
        System.out.print("Masukkan stok bawang putih (siung) ");
        int bawangPutih = scan.nextInt();
        int porsiBawangPutih = bawangPutih/4;
        System.out.print("Masukkan stok telur (butir) ");
        int telur = scan.nextInt();
        int porsiTelur = telur/1;
        System.out.print("Maukkan stok saos tomat (sendok) ");
        int saosTomat = scan.nextInt();
        int porsiSaosTomat = saosTomat/5;
        System.out.print("Masukkan stok ayam (gram) ");
        int ayam = scan.nextInt();
        int porsiAyam = ayam/50;
        System.out.print("Masukkan stok garam (sendok teh) ");
        int garam = scan.nextInt();
        int porsiGaram = garam/1;
        System.out.print("Masukkan stok merica (sendok teh) ");
        int merica = scan.nextInt();
        int porsiMerica = (int) (merica/0.25);
        if (porsiNasiPutih<porsiBawangPutih){
            min = porsiNasiPutih;
        }
        if (porsiBawangPutih<porsiNasiPutih){
            min = porsiBawangPutih;
        }
        if (min>telur){
            min = telur;
        }
        if (min>saosTomat){
            min = saosTomat;
        }
        if (min>ayam){
            min = ayam;
        }
        if (min>garam){
            min = garam;
        }
        if (min>merica){
            min = merica;
        }
        System.out.println("Jadi porsi yang dapat dibuat adalah " + merica + " porsi");
    }
}
