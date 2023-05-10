
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
public class Method2 {

    double cashback;

    public static void main(String[] args) {
        Method2 t = new Method2();
        double cb = t.getInput("Masukkan persentase cashback (dalam %): ");
        double tt = t.getInput("Masukkan total transaksi : ");
        t.hitungCashback(cb, tt);
        System.out.println("Jadi nominal cashbacknya adalah " + t.cashback);
    }

    public double getInput(String label) {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        double input = scan.nextDouble();
        return input;
    }

    public void hitungCashback(double cb, double tt) {
        cashback = cb * tt / 100;
    }
}
