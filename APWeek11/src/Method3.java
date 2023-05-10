
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
public class Method3 {

    double result;

    public static void main(String[] args) {
        Method3 t = new Method3();
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        double option = t.getInput("Input : ");

        if (option == 1) {
            double panjang = t.getInput("Masukkan panjang : ");
            double lebar = t.getInput("Masukkan lebar : ");
            t.luasPersegiPanjang(panjang, lebar);
            System.out.println("Luasnya adalah " + t.result);
        } else if (option == 2) {
            double jari = t.getInput("Masukkan jari - jari : ");
            t.luasLingkaran(jari);
            System.out.println("Luasnya adalah " + t.result);
        } else if (option == 3) {
            double alas = t.getInput("Masukkan alas : ");
            double tinggi = t.getInput("Masukkan tinggi : ");
            t.luasSegitiga(alas, tinggi);
            System.out.println("Luasnya adalah " + t.result);
        }
    }

    public double getInput(String label) {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        double input = scan.nextDouble();
        return input;
    }

    public void luasSegitiga(double alas, double tinggi) {
        result = alas * tinggi / 2;
    }

    public void luasLingkaran(double jari) {
        result = Math.PI * jari * jari;
    }

    public void luasPersegiPanjang(double panjang, double lebar) {
        result = panjang * lebar;
    }
}
