
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
public class Prima6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka ");
        int x = scan.nextInt();
        int mod;
        boolean prima = true;
        for (int i = 2; i <= x / 2; i++) {
            mod = x % i;
            if (mod == 0) {
                prima = false;
                break;
            }
        }
        if (prima && ((x > 0) && (x != 1))) {
            System.out.println(x + " adalah bilangan prima");
        } else {
            System.out.println(x + " bukan bilangan prima");
        }
    }
}
