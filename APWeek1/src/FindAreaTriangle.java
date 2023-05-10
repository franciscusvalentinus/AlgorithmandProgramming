
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caeciliacitra
 */
public class FindAreaTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Height : ");
        int h = s.nextInt();
        System.out.println("Width : ");
        int w = s.nextInt();
        double area = 0.5* h*w;
        System.out.println("Area = " + area);
        
    }
}
