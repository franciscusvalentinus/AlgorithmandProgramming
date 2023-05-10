
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
public class Deret5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai x ");
        int x = scan.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    
                    System.out.println(i);
                }
            }
            /*if (i%6 == 0){
                System.out.println(i);
            }*/

            //dapat juga menggunakan operator AND
        }
    }
}
