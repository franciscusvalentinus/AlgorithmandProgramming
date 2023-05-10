
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
public class Kuis4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baris :");
        int x = scan.nextInt();
        System.out.println("kolom :");
        int y = scan.nextInt();

        for (int i = 0; i <= x * 3; i++) {
            for (int j =0 ; j <= y * 3; j++) {
                if (j == 0 || j%3 == 0 || i == 0 || i%3 == 0 ) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(" ");
        }

    }
}
