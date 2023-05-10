
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
public class WeeklyProfit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Jumlah : ");
        int n = s.nextInt();
        System.out.println("Biaya : ");
        int c = s.nextInt();
        int profit = 7* (n *(5000-c));
        System.out.println("Profit Seminggu = " + profit);
        
    }
    
}
