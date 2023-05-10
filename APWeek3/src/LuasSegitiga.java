
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
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi a ");
        int a = scan.nextInt();
        System.out.print("Masukkan panjang sisi b ");
        int b = scan.nextInt();
        System.out.print("Masukkan panjang sisi c ");
        int c = scan.nextInt();
        double s = (a+b+c)/2;
        double luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        //reminder untuk diri sendiri
        //hiraukan jika membacanya
        //pr
        //kenapa if nya ga boleh langsung if luas
        if (s*(s-a)*(s-b)*(s-c)<0){
            System.out.println("sisi a,b,c tidak dapat membentuk segitiga");
        }
        else {
            System.out.println("Luas nya adalah " + luas);
        }
    }
}
