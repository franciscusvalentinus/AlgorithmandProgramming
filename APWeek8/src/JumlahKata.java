
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
public class JumlahKata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String x = scan.nextLine();
        String akr = String.valueOf(x.charAt(0));
        for (int i = 1; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                akr = akr.concat(String.valueOf(x.charAt(i+1)));
            }
        }
        int y = akr.length();
        System.out.println("Output : " + y);
    }
}
