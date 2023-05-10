
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
public class Supermarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //reminder untuk diri sendiri
        //hiraukan jika membacanya
        //dipelajari lagi
        int total1=0;
        int total2=0;
        int total3=0;
        int a4=0;
        int b4=0;
        int c4=0;
        int disc1=0;
        int disc2=0;
        int disc3=0;
        System.out.println("Kode produk :");
        System.out.println("1. P&G");
        System.out.println("2. Wings");
        System.out.println("3. Others");
        System.out.print("Input kode :");
        int a1 = scan.nextInt();
        System.out.print("Harga satuan :");
        int a2 = scan.nextInt();
        System.out.print("Jumlah :");
        int a3 = scan.nextInt();
        System.out.print("Input kode :");
        int b1 = scan.nextInt();
        System.out.print("Harga satuan :");
        int b2 = scan.nextInt();
        System.out.print("Jumlah :");
        int b3 = scan.nextInt();
        System.out.print("Input kode :");
        int c1 = scan.nextInt();
        System.out.print("Harga satuan :");
        int c2 = scan.nextInt();
        System.out.print("Jumlah :");
        int c3 = scan.nextInt();
        if (a1==1){
            a4=a2*a3;
            total1 = a4-a4*1/4;
            disc1 = a4*1/4;
        }
        else if (a1==2){
            a4=a2*a3;
            total1 = a4-a4*1/10;
            disc1 = a4*1/10;
        }
        else if (a3==3){
            a4=a2*a3;
            total1 = a4;
        }
        if (b1==1){
            b4=b2*b3;
            total2 = b4-b4*1/4;
            disc2 = b4*1/4;
        }
        else if (b1==2){
            b4=b2*b3;
            total2 = b4-b4*1/10;
            disc2 = b4*1/10;
        }
        else if (b3==3){
            b4=b2*b3;
            total2 = b4;
        }
        if (c1==1){
            c4=c2*c3;
            total3 = c4-c4*1/4;
            disc3 = c4*1/4;
        }
        else if (c1==2){
            c4=c2*c3;
            total3 = c4-c4*1/10;
            disc3 = c4*1/10;
        }
        else if (c3==3){
            c4=c2*c3;
            total3 = c4;
        }
        System.out.println("");
        System.out.println("Menggunakan Kartu Kredit ?" );
        System.out.println("1. Yes");
        System.out.println("2. No");
        int kartuKredit = scan.nextInt();
        if (kartuKredit==1){
            int atot = a4+b4+c4;
            System.out.println("Total :" + atot);
            int totdisc = disc1+disc2+disc3;
            System.out.println("Diskon :" +totdisc);
            int fulltotal = total1+total2+total3;
            int full = fulltotal+fulltotal*5/200;
            System.out.println("Bayar :" + full);
            
        }
        else{
            int atot = a4+b4+c4;
            System.out.println("Total :" + atot);
            int totdisc = disc1+disc2+disc3;
            System.out.println("Diskon :" +totdisc);
            int fulltotal = total1+total2+total3;
            int full = fulltotal;
            System.out.println("Total belanja :" + full);
        }
    }
}