
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
public class AdvTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pilih salah satu dari 4 macam input berikut");
        System.out.println("Input 1 untuk mengubah dari Celcius");
        System.out.println("Input 2 untuk mengubah dari Fahrenheit");
        System.out.println("Input 3 untuk mengubah dari Reamur");
        System.out.println("Input 4 untuk mengubah dari Kelvin");
        int input = scan.nextInt();
        if(input==1){
            System.out.print("Masukkan berapa derajat suhu celcius ");
            double celcius = scan.nextDouble();
            double reamur = (0.8)*celcius;
            double fahrenheit = (1.8)*celcius+32;
            double kelvin = celcius+273;
            System.out.println("Menjadi " + reamur + " derajat Reamur");
            System.out.println("Menjadi " + fahrenheit + " derajat Fahrenheit");
            System.out.println("Menjadi " + kelvin + " derajat Kelvin");
        }
        if(input==2){
            System.out.print("Masukkan berapa derajat suhu fahrenheit ");
            double fahrenheit = scan.nextDouble();
            double celcius = 5*(fahrenheit-32)/9;
            double reamur = 4*(fahrenheit-32)/9;
            double kelvin = 5*(fahrenheit-32)/9+273;
            System.out.println("Menjadi " + celcius + " derajat Celcius");
            System.out.println("Menjadi " + reamur + " derajat Reamur");
            System.out.println("Menjadi " + kelvin + " derajat Kelvin");
        }
        if(input==3){
            System.out.print("Masukkan berapa derajat suhu reamur ");
            double reamur = scan.nextDouble();
            double celcius = 5*reamur/4;
            double fahrenheit = 9*reamur/4+32;
            double kelvin = 5*reamur/4+273;
            System.out.println("Menjadi " + celcius + " derajat Celcius");
            System.out.println("Menjadi " + fahrenheit + " derajat Fahrenheit");
            System.out.println("Menjadi " + kelvin + " derajat Kelvin");
        }
        if(input==4){
            System.out.print("Masukkan berapa derajat suhu kelvin ");
            double kelvin = scan.nextDouble();
            double celcius = kelvin-273;
            double fahrenheit = 9*(kelvin-273)/5+32;
            double reamur = 4*(kelvin-273)/5;
            System.out.println("Menjadi " + celcius + " derajat Celcius");
            System.out.println("Menjadi " + fahrenheit + " derajat Fahrenheit");
            System.out.println("Menjadi " + reamur + " derajat Reamur");
        }
    }
}
