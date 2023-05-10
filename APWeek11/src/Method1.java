
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
public class Method1 {

    double bmi;

    public static void main(String[] args) {
        Method1 t = new Method1();
        double tb = t.getInput("Masukkan tinggi badan (dalam meter) : ");
        double bb = t.getInput("Masukkan berat badan (dalam kilogram) : ");
        t.hitungBMI(tb, bb);
        System.out.println("Jadi Body Mass Index anda adalah " + t.bmi);
    }

    public double getInput(String label) {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        double input = scan.nextDouble();
        return input;
    }

    public void hitungBMI(double tb, double bb) {
        bmi = bb / Math.pow(tb, 2);
    }

}
