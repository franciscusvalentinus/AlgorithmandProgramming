
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
public class Trial3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input x : ");
        int x = scan.nextInt();
        int j = 1;
        for (int i = 0; i < x; i++) {
            for (int b = x; b > i; b--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= 1+i; j++) {
                System.out.print(x-(j-1));
            }
            for (int k = j-2; k >= 1; k--) {
                System.out.print(x-(k-1));
            }
            System.out.println("");
        }
    }
}
