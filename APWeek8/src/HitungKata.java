
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
public class HitungKata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input");
        System.out.print("Kalimat : ");
        String x = scan.nextLine();
        String[] arr = x.split(" ");
        System.out.print("\nKata yang dicari : ");
        String search = scan.next();
        boolean src = false;
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            src = arr[i].equalsIgnoreCase(search);
            if(src==true){
                total+=1;
            }
        }        
        System.out.println("\nOutput");
        System.out.printf("Jumlah kata : %s \n",total);
    }
}
