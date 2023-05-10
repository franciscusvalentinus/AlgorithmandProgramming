
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
public class Fibonacci4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyak deret bilangan Fibonacci ");
        int x = scan.nextInt();
        int bil1 = 0;
        int bil2 = 1;
        int bil3 = 0;
        System.out.print(bil1 + ",");
        System.out.print(bil2 + ",");
        for (int i = 3; i <= x; i++) {
            if (i == x) {
                bil3 = bil1 + bil2;
                bil1 = bil2;
                bil2 = bil3;
                System.out.print(bil3);
            } else {
                bil3 = bil1 + bil2;
                bil1 = bil2;
                bil2 = bil3;
                System.out.print(bil3 + ",");
            }
        }
        System.out.println("");
    }
}
