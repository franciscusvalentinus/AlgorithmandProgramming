
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
public class Prima1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nilai x : ");
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            int ctr = 0;
            //counter
            for (int c = 1; c <= i; c++) {
                if (i % c == 0) {
                    ctr++;
                }
            }
            if (ctr == 2) {
                System.out.println(i);
                //apabila counter bervalue 2, maka akan diprint 
            }
        }
    }
}
