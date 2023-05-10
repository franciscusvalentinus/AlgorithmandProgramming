
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caeciliacitra
 */
public class CicilanMobil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Harga Mobil : ");
        int harga = s.nextInt();
        System.out.println("Jumlah Bulan : ");
        int n = s.nextInt();
        double dp = 0.1* harga;
        double bunga = 0.15* harga;
        double cicil = (harga + bunga - dp)/n;
        System.out.println("Uang Muka : " + dp);
        System.out.println("Cicilan : " + cicil);
        
    }
    
}
