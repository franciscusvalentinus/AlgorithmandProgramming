
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
public class AdvBiggest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka ke 1 : ");
        double angka1 = scan.nextDouble();
        System.out.print("Masukkan angka ke 2 : ");
        double angka2 = scan.nextDouble();
        System.out.print("Masukkan angka ke 3 : ");
        double angka3 = scan.nextDouble();
        System.out.println("");
        //reminder untuk diri sendiri
        //hiraukan jika membacanya
        //pake AND lagi
        //AND sering dipake
        if (angka1>angka2 && angka1>angka3) {
            System.out.println("Bilangan terbesar pertama " + angka1);
            if(angka2>angka3){
                System.out.println("Bilangan terbesar kedua " + angka2);
                System.out.println("Bilangan terbesar ketiga " + angka3);
            }
            else{
                System.out.println("Bilangan terbesar kedua " + angka3);
                System.out.println("Bilangan terbesar ketiga " + angka2);
            }
        }
        else if (angka2>angka1 && angka2>angka3) {
            System.out.println("Bilangan terbesar pertama " + angka2);
            if(angka1>angka3){
                System.out.println("Bilangan terbesar kedua " + angka1);
                System.out.println("Bilangan terbesar ketiga " + angka3);
            }
            else{
                System.out.println("Bilangan terbesar kedua " + angka3);
                System.out.println("Bilangan terbesar ketiga " + angka1);
            }
        }
        else {
            System.out.println("Bilangan terbesar pertama " + angka3);
            if(angka2>angka1){
                System.out.println("Bilangan terbesar kedua " + angka2);
                System.out.println("Bilangan terbesar ketiga " + angka1);
            }
            else{
                System.out.println("Bilangan terbesar kedua " + angka1);
                System.out.println("Bilangan terbesar ketiga " + angka2);
            }
        }
    }
}