
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
public class MoneyLeft {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("My Money : ");
        int m = s.nextInt();
        System.out.println("My friends : ");
        int f = s.nextInt();
        double left = (m-((f+1)*2500));
        System.out.println("Money Left " + left);
        
    }
    
}
