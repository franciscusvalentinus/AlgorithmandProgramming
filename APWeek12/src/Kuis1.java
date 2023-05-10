
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Kuis1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input angka : ");
        int x = scan.nextInt();
        String nul = "enol";
        String q = "satu";
        String w = "dua";
        String e = "tiga";
        String r = "empat";
        String t = "lima";
        String y = "enam";
        String u = "tujuh";
        String i = "delapan";
        String o = "sembilan";
        String p = " puluh";
        String belas = " belas";
        String ten = "sepuluh";
        String eleven = "sebelas";
        int ctr, ctr2;
        System.out.print("Output : ");
        if (x >= 0 && x <= 10) {
            ctr = x;
            if (ctr == 0) {
                System.out.println(nul);
            } else if (ctr == 1) {
                System.out.println(q);
            } else if (ctr == 2) {
                System.out.println(w);
            } else if (ctr == 3) {
                System.out.println(e);
            } else if (ctr == 4) {
                System.out.println(r);
            } else if (ctr == 5) {
                System.out.println(t);
            } else if (ctr == 6) {
                System.out.println(y);
            } else if (ctr == 7) {
                System.out.println(u);
            } else if (ctr == 8) {
                System.out.println(i);
            } else if (ctr == 9) {
                System.out.println(o);
            } else if (ctr == 10) {
                System.out.println(ten);
            }
        } else if (x == 20 || x == 30 || x == 40 || x == 50 || x == 60 || x == 70 || x == 80 || x == 90) {
            ctr = x / 10;
            if (ctr == 2) {
                System.out.println(w + p);
            } else if (ctr == 3) {
                System.out.println(e + p);
            } else if (ctr == 4) {
                System.out.println(r + p);
            } else if (ctr == 5) {
                System.out.println(t + p);
            } else if (ctr == 6) {
                System.out.println(y + p);
            } else if (ctr == 7) {
                System.out.println(u + p);
            } else if (ctr == 8) {
                System.out.println(i + p);
            } else if (ctr == 9) {
                System.out.println(o + p);
            }
        } else if (x > 10 && x < 20) {
            ctr2 = x % 10;
            switch (ctr2) {
                case 1:
                    System.out.println(eleven);
                    break;
                case 2:
                    System.out.println(w + belas);
                    break;
                case 3:
                    System.out.println(e + belas);
                    break;
                case 4:
                    System.out.println(r + belas);
                    break;
                case 5:
                    System.out.println(t + belas);
                    break;
                case 6:
                    System.out.println(y + belas);
                    break;
                case 7:
                    System.out.println(u + belas);
                    break;
                case 8:
                    System.out.println(i + belas);
                    break;
                case 9:
                    System.out.println(o + belas);
                    break;
            }
        } else if ((x > 20 && x < 30) || (x > 30 && x < 40) || (x > 40 && x < 50) || (x > 50 && x < 60) || (x > 60 && x < 70) || (x > 70 && x < 80) || (x > 80 && x < 90) || (x > 90 && x < 100)) {
            ctr = x / 10;
            if (ctr == 2) {
                System.out.print(w + p + " ");
            } else if (ctr == 3) {
                System.out.print(e + p + " ");
            } else if (ctr == 4) {
                System.out.print(r + p + " ");
            } else if (ctr == 5) {
                System.out.print(t + p + " ");
            } else if (ctr == 6) {
                System.out.print(y + p + " ");
            } else if (ctr == 7) {
                System.out.print(u + p + " ");
            } else if (ctr == 8) {
                System.out.print(i + p + " ");
            } else if (ctr == 9) {
                System.out.print(o + p + " ");
            }
            ctr2 = x % 10;
            if (ctr2 == 1) {
                System.out.println(q);
            } else if (ctr2 == 2) {
                System.out.println(w);
            } else if (ctr2 == 3) {
                System.out.println(e);
            } else if (ctr2 == 4) {
                System.out.println(r);
            } else if (ctr2 == 5) {
                System.out.println(t);
            } else if (ctr2 == 6) {
                System.out.println(y);
            } else if (ctr2 == 7) {
                System.out.println(u);
            } else if (ctr2 == 8) {
                System.out.println(i);
            } else if (ctr2 == 9) {
                System.out.println(o);
            }
        } else {
            System.out.println("Tolong input angka dari 0-99");
        }
    }
}
