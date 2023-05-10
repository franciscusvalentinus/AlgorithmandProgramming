
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
public class Kapital3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*char a=75, b=66, c=67;
        float anfloat = 23e4f;
        double andouble = 34e4d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(anfloat);
        System.out.println(andouble);*/
        System.out.print("Masukkan huruf ");
        char huruf = scan.next().charAt(0);
        for (char i = 65; i <= huruf; i++) {
            System.out.println(i);
        }
    }
}
