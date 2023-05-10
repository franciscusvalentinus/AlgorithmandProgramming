
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
public class BMI6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan (dalam meter) ");
        double tinggi = scan.nextDouble();
        System.out.print("Masukkan berat badan (dalam kilogram) ");
        double berat = scan.nextDouble();
        double bmi = berat/Math.pow(tinggi,2);
        System.out.println("Jadi Body Mass Index anda adalah " + bmi);
        //reminder untuk diri sendiri
        //hiraukan jika membacanya
        //&& adalah AND
        if (bmi <= 18.4){
            System.out.println("Anda kekurangan berat badan");
        }
        else if (bmi <= 24.9 && bmi >= 18.5){
            System.out.println("Berat badan anda normal");
        }
        else if (bmi <= 29.9 && bmi >= 25){
            System.out.println("Anda kelebihan berat badan");
        }
        else if (bmi >= 30){
            System.out.println("Anda kegemukan");
        }
    }
}
