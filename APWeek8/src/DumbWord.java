
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
public class DumbWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String x = scan.nextLine();
        char a = 'a';
        char b = 'a';
        char c = 'a';
        char d = 'a';
        String[] kata = x.split(" ");
        String[] kata2 = x.split(" ");
        System.out.print("Output : ");
        for (int i = 0; i < kata.length; i++) {
            a = kata[i].charAt(0);
            c = kata[i].charAt(0);
            b = kata2[i].charAt((kata2[i].length()) - 1);
            if ((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o')) {
                do {
                    kata[i] = kata[i].substring(1) + a;
                    a = kata[i].charAt(0);
                } while ((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o'));

                if ((b == 'a') || (b == 'i') || (b == 'u') || (b == 'e') || (b == 'o')) {
                    kata[i] = kata[i] + "way";
                } else {
                    kata[i] = kata[i] + "ay";
                }

            } else if ((a == 'a') || (a == 'i') || (a == 'u') || (a == 'e') || (a == 'o')) {
                kata[i] = "sh" + kata[i];
            }
            d = kata[i].charAt(0);
            if (c >= 65 && c <= 90) {
                System.out.print((char) (d - 32) + kata[i].substring(1).toLowerCase() + " ");
            } else {
                System.out.print(kata[i].toLowerCase() + " ");
            }
        }
        System.out.println("");
    }
}