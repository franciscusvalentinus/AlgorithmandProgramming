
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
public class FindAreaCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("radius : ");
        int r = s.nextInt();
        double area = Math.PI*r*r;
        System.out.println("Area = " + area);
        
    }
}
