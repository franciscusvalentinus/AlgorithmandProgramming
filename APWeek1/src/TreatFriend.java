
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
public class TreatFriend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("My money: ");
        int m = s.nextInt();
        int friends = (m/2500) -1;
        System.out.println("I can treat " + friends + " friends");
        
    }
    
}
