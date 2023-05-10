
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
public class Hangman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Soal : ");
        String x = scan.nextLine();
        String[] jawaban = x.split("(?!^)");
        String[] soal = x.split("(?!^)");
        int chance = 3;
        String tebak;
        for (int i = 0; i < 1000; i++) {
            System.out.println("");
        }
        for (int a = 0; a < jawaban.length; a++) {
            if (!soal[a].equalsIgnoreCase(" ")) {
                soal[a] = "_";
            }
        }
        while (true) {
            boolean finish = true;
            boolean answer = true;
            for (int a = 0; a < jawaban.length; a++) {
                System.out.print(soal[a] + " ");
            }
            System.out.println(" ");
            System.out.print("Tebak : ");
            tebak = scan.next();
            for (int a = 0; a < jawaban.length; a++) {
                if (tebak.equalsIgnoreCase(jawaban[a])) {
                    soal[a] = tebak;
                    answer = false;
                }
                if (soal[a].equalsIgnoreCase("_")) {
                    finish = false;
                }
            }
            if (answer == true) {
                chance--;
                System.out.printf("Anda Salah! %s kesempatan lagi\n", chance);
            }
            if (chance == 0) {
                System.out.println("Game Over !");
                break;
            }
            if (finish == true) {
                for (int a = 0; a < jawaban.length; a++) {
                    System.out.print(soal[a] + " ");
                }
                System.out.println();
                System.out.println("Anda Menang !!");
                break;
            }
        }
    }
}
