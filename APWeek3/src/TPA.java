
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
public class TPA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan berapa usia anak anda ");
        int usia = scan.nextInt();
        System.out.print("Masukkan berapa jam akan dititipkan ");
        int jam = scan.nextInt();
        //reminder untuk diri sendiri
        //hiraukan jika membacanya
        //sekarang OR
        //harus ingat perbedaan AND & OR
        //karena yang paling sering dipake
        if (usia==0 || usia==1){
            int harga = jam*30000;
            System.out.println("Biaya yang harus dibayar "+harga);
        }
        else if(usia==2 || usia==3){
            int harga = jam*40000;
            System.out.println("Biaya yang harus dibayar "+harga);
        }
        else{
            int harga = jam*50000;
            System.out.println("Biaya yang harus dibayar "+harga);
        }
    }
}
