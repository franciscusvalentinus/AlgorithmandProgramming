
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
public class Method6 {

    boolean prima;

    public static void main(String[] args) {
        Method6 t = new Method6();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input angka : ");
        int angka = scan.nextInt();
        int counter = 0;
        t.isPrima(angka, counter);
        if (t.prima == true) {
            System.out.print("TRUE");
        } else if (t.prima == false) {
            System.out.print("FALSE");
        }
    }

    public boolean isPrima(int angka, int counter) {
        for (int i = 1; i <= angka; i++) {
            if (angka % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            prima = true;
        } else {
            prima = false;
        }
        return prima;
    }
}
