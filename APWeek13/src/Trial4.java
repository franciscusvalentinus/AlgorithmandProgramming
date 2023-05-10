
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
public class Trial4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Kata : ");
        String kata = scan.nextLine();
        System.out.print("Huruf ke : ");
        int huruf = scan.nextInt();
        huruf -= 1;
        char output = kata.charAt(huruf);
        switch(output){
            case '1':
                System.out.println(" |");
                System.out.println(" |");
                break;
            case '2':
                System.out.println("--");
                System.out.println("  |");
                System.out.println("--");
                System.out.println("|");
                System.out.println("--");
                break;
            case '3':
                System.out.println("--");
                System.out.println(" |");
                System.out.println("--");
                System.out.println(" |");
                System.out.println("--");
                break;
            case 'a':
                System.out.println(" -- ");
                System.out.println("|  |");
                System.out.println(" -- ");
                System.out.println("|  |");
                break;
            case '8':
                System.out.println(" -- ");
                System.out.print("|  |");
                System.out.println(" -- ");
                System.out.print("|  |");
                System.out.println(" -- ");
                break;
        }
    }
}
