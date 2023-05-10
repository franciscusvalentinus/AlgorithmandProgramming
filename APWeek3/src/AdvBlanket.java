
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
public class AdvBlanket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*reminder
        DIPELAJARI LAGI
        YANG PALING SUSAH
        */
        int modal = 25000;
        int harga = 50000;
        int gaji = 50000;
        int unit = 100;
        int laba = harga - modal;
        int tot1=0;
        int tot2=0;
        int tot3=0;
        int bayar =0;
        System.out.print("Pembeli 1 : ");
        int unit1 = scan.nextInt();
        System.out.print("Pembeli 2 : ");
        int unit2 = scan.nextInt();
        System.out.print("Pembeli 3 : ");
        int unit3 = scan.nextInt();
        if (unit1 >= 100) {
            bayar = laba * 100 - gaji - 5000 - laba * 10;
            System.out.println("Laba :" + bayar);
        } 
        else if (unit1<100 && unit1>=20){
            tot1 = laba * unit1 - 5000 - laba * unit1/10;
            unit = unit-unit1-unit1/10;
            if (unit2>unit && unit2>=20){
                tot2 = laba * unit - 5000 - laba * unit2/10;
                unit=unit-unit2-unit2/10;
            }
            else if(unit2>unit){
                tot2 = laba * unit - laba * unit2/10;
                unit=unit-unit2-unit2/10;
            }
            else if(unit2<unit && unit2>=20){
                tot2 = laba * unit2 - 5000 - laba * unit2/10;
                unit = unit-unit2-unit2/10;
                if(unit3>unit && unit>=20){
                    tot3 = laba * unit - 5000;
                }
                else if (unit3>unit){
                    tot3 = laba * unit;
                }
                else if (unit3<=unit && unit3>=20){
                    tot3 = laba * unit3 - 5000 - laba * unit3/10;
                }
                else if (unit3<=unit){
                    tot3 = laba * unit3 - laba * unit3/10;
                }
            }
            else if(unit2<unit){
                tot2 = laba * unit2 - laba * unit2/10;
                unit = unit-unit2-unit2/10;
                if(unit3>unit && unit>=20){
                    tot3 = laba * unit - 5000;
                }
                else if (unit3>unit){
                    tot3 = laba * unit;
                }
                else if (unit3<=unit && unit3>=20){
                    tot3 = laba * unit3 - 5000 - laba * unit3/10;
                }
                else if (unit3<=unit){
                    tot3 = laba * unit3 - laba * unit3/10;
                }
            }
            System.out.println("Laba :");
            System.out.println(tot1+tot2+tot3-gaji);
        }
        else if (unit1<100){
            tot1 = laba * unit1 - laba * unit1/10;
            unit = unit-unit1-unit1/10;
            if (unit2>unit && unit2>=20){
                tot2 = laba * unit - 5000 - laba * unit2/10;
                unit=unit-unit2-unit2/10;
            }
            else if(unit2>unit){
                tot2 = laba * unit - laba * unit2/10;
                unit=unit-unit2-unit2/10;
            }
            else if(unit2<unit && unit2>=20){
                tot2 = laba * unit2 - 5000 - laba * unit2/10;
                unit = unit-unit2-unit2/10;
                if(unit3>unit && unit3>=20){
                    tot3 = laba * unit - 5000 - laba * unit3/10;
                }
                else if (unit3>unit){
                    tot3 = laba * unit - laba * unit3/10;
                }
                else if (unit3<=unit && unit3>=20){
                    tot3 = laba * unit3 - 5000 - laba * unit3/10;
                }
                else if (unit3<=unit){
                    tot3 = laba * unit3 - laba * unit3/10;
                }
            }
            else if(unit2<unit){
                tot2 = laba * unit2 - laba * unit2/10;
                unit = unit-unit2-unit2/10;
                if(unit3>unit && unit3>=20){
                    tot3 = laba * unit - 5000 - laba * unit3/10;
                }
                else if (unit3>unit){
                    tot3 = laba * unit - laba * unit3/10;
                }
                else if (unit3<=unit && unit3>=20){
                    tot3 = laba * unit3 - 5000 - laba * unit3/10;
                }
                else if (unit3<=unit){
                    tot3 = laba * unit3 - laba * unit3/10;
                }
            }
            System.out.println("Laba :");
            System.out.println(tot1+tot2+tot3-gaji);
            
        }
            
    }
}
