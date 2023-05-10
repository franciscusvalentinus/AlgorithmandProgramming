
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
public class LuasBangun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih bangun luas yang ingin dihitung ");
        System.out.print("(persegi panjang/lingkaran/segitiga) ");
        String bangun = scan.nextLine();
        if ("persegi panjang".equalsIgnoreCase(bangun)){
            //untuk input string menghiraukan sensitiveCase
            System.out.print("Masukkan panjang persegi panjang ");
            double ppp = scan.nextInt();
            System.out.print("Masukkan lebar persegi panjang ");
            double lpp = scan.nextInt();
            System.out.println("Luas persegi panjang adalah " + (ppp*lpp));
        }
        else if("lingkaran".equalsIgnoreCase(bangun)){
            System.out.print("Masukkan jari - jari lingkaran ");
            double jari = scan.nextDouble();
            System.out.println("Luas lingkaran adalah " + (3.14*jari*jari));
        }
        else if("segitiga".equalsIgnoreCase(bangun)){
            System.out.print("Masukkan alas segitiga ");
            double alas = scan.nextDouble();
            System.out.print("Masukkan tinggi segitiga ");
            double tinggi = scan.nextDouble();
            System.out.println("Luas segitiga adalah " + (alas*tinggi/2));
        }
        
    }
}
