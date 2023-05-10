
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
public class FindAreaRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Length : ");
        int l = s.nextInt();
        System.out.println("Width : ");
        int w = s.nextInt();
        int area = l*w;
        System.out.println("Area = " + area);
        
    }
    
}
