
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
public class Method4 {

    double result;

    public static void main(String[] args) {
        Method4 t = new Method4();
        System.out.println("INPUT :");
        System.out.println("Temperatur :");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        double option1 = t.getInput("\nPilih Temperatur Awal : ");
        double option2 = t.getInput("Pilih Temperatur Akhir : ");

        if (option1 == 1 && option2 == 2) {
            double suhu = t.getInput("Suhu : ");
            t.CelciusToFahrenheit(suhu);
            System.out.println(t.result);
        } else if (option1 == 1 && option2 == 3) {
            double suhu = t.getInput("Suhu : ");
            t.CelciusToKelvin(suhu);
            System.out.println(t.result);
        } else if (option1 == 2 && option2 == 1) {
            double suhu = t.getInput("Suhu : ");
            t.FahrenheitToCelcius(suhu);
            System.out.println(t.result);
        } else if (option1 == 2 && option2 == 3) {
            double suhu = t.getInput("Suhu : ");
            t.FahrenheitToCelcius(suhu);
//            t.CelciusToKelvin(suhu);
            System.out.println(t.result + 273);
        } else if (option1 == 3 && option2 == 1) {
            double suhu = t.getInput("Suhu : ");
            t.KelvinToCelcius(suhu);
            System.out.println(t.result);
        } else if (option1 == 3 && option2 == 2) {
            double suhu = t.getInput("Suhu : ");
            t.KelvinToCelcius(suhu);
            suhu = t.result;
            t.CelciusToFahrenheit(suhu);
            System.out.println(t.result);
        }
    }

    public void CelciusToKelvin(double suhu) {
        result = suhu + 273;
    }

    public void KelvinToCelcius(double suhu) {
        result = suhu - 273;
    }

    public void CelciusToFahrenheit(double suhu) {
        result = (1.8) * suhu + 32;
    }

    public void FahrenheitToCelcius(double suhu) {
        result = 5 * (suhu - 32) / 9;
    }

    public double getInput(String label) {
        Scanner scan = new Scanner(System.in);
        System.out.print(label);
        double input = scan.nextDouble();
        return input;
    }
}
