
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
public class Alay2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String x = scan.nextLine();
        //kecil
        x = x.replace("a", "aga");
        x = x.replace("i", "igi");
        x = x.replace("u", "ugu");
        x = x.replace("e", "ege");
        x = x.replace("o", "ogo");
        //besar
        x = x.replace("A", "AGA");
        x = x.replace("I", "IGI");
        x = x.replace("U", "UGU");
        x = x.replace("E", "EGE");
        x = x.replace("O", "OGO");
        System.out.print("Output : " + x + "\n");
    }
}
