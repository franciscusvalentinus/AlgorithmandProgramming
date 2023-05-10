
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
public class Pangkat2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //hampir sama seperti code nya Ko Evan kemarin senin
        System.out.print("Masukkan nilai x ");
        int x = scan.nextInt();
        System.out.print("Masukkan nilai y ");
        int y = scan.nextInt();
        int total = 1;
        for (int i = 1; i <= y; i++) {
            if (i == y) {
                System.out.print(x);
            } else {
                System.out.print(x + "x");
            }
            total = total * x;
        }
        System.out.println("=" + total);
    }
}
