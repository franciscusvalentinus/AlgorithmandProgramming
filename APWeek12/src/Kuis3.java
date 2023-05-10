
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author student
 */
public class Kuis3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pilih = "N";
        int total1 = 0;
        int total2 = 0;
        int seluruh = 0;
        int input = 0;

        while (pilih.equalsIgnoreCase("N")) {
            System.out.println("1.Lihat menu");
            System.out.println("2.Pesan makanan");
            System.out.println("3.Pesan minuman");
            System.out.println("4.tagihan");
            System.out.println("5.hapus");
            System.out.println("6.keluar");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("MENU MAKANAN");
                System.out.println("nasi goreng ayam Rp15.000");
                System.out.println("nasi goreng telur Rp15.000");
                System.out.println("nasi goreng special Rp18.000");
                System.out.println("nasi campur Rp15.000");
                System.out.println("nasi ayam kremes Rp 15.000");
                System.out.println("nasi goreng ayam Rp15.000");
                System.out.println("MENU MINUMAN");
                System.out.println("es teh tawar Rp 3.000");
                System.out.println("es teh manis Rp 4.000");
                System.out.println("teh tawar hangat Rp2.000");
                System.out.println("teh manis hangat Rp 3.000");
                System.out.println("es teh Rp 4.000");
                System.out.println("jeruk hangat Rp 3.000");
                System.out.println("jus apel Rp 6.000");
                System.out.println("jus tomat Rp 6.000");
                System.out.println("jus wortel Rp 6.000");
                System.out.println("jus kulit manggis Rp 6.000");
                System.out.println("jus melon Rp 6.000");
                System.out.println("soda gembira Rp 7.000");
            }

            if (input == 2) {
                pilih = "Y";
                while (pilih.equalsIgnoreCase("Y")) {
                    System.out.println("MENU MAKANAN");
                    System.out.println("1.nasi goreng ayam Rp15.000");
                    System.out.println("2.nasi goreng telur Rp15.000");
                    System.out.println("3.nasi goreng special Rp18.000");
                    System.out.println("4.nasi campur Rp15.000");
                    System.out.println("5.nasi ayam kremes Rp 15.000");
                    System.out.println("6.nasi goreng ayam Rp15.000");
                    System.out.println("====================================");
                    System.out.println("Makanan nomor :");
                    int makan = scan.nextInt();
                    System.out.println("julah makanan");
                    int ja = scan.nextInt();
                    if (makan == 1) {
                        total1 = total1 + 15000 * ja;
                        System.out.println(total1);
                    }
                    if (makan == 2) {
                        total1 = total1 + 15000 * ja;
                        System.out.println(total1);
                    }
                    if (makan == 3) {
                        total1 = total1 + 18000 * ja;
                        System.out.println(total1);
                    }
                    if (makan == 4) {
                        total1 = total1 + 15000 * ja;
                        System.out.println(total1);
                    }
                    if (makan == 5) {
                        total1 = total1 + 15000 * ja;
                        System.out.println(total1);
                    }
                    if (makan == 6) {
                        total1 = total1 + 15000 * ja;
                        System.out.println(total1);
                    }
                    System.out.println(" tambah pesanan Y /N");
                    pilih = scan.next();
                }
            }

            if (input == 3) {
                pilih = "Y";
                while (pilih.equalsIgnoreCase("Y")) {
                    System.out.println("MENU MINUMAN");
                    System.out.println("1.es teh tawar Rp 3.000");
                    System.out.println("2.es teh manis Rp 4.000");
                    System.out.println("3.teh tawar hangat Rp2.000");
                    System.out.println("4.teh manis hangat Rp 3.000");
                    System.out.println("5.es teh Rp 4.000");
                    System.out.println("6.jeruk hangat Rp 3.000");
                    System.out.println("7.jus apel Rp 6.000");
                    System.out.println("8.jus tomat Rp 6.000");
                    System.out.println("9.jus wortel Rp 6.000");
                    System.out.println("10.jus kulit manggis Rp 6.000");
                    System.out.println("11.jus melon Rp 6.000");
                    System.out.println("12.soda gembira Rp 7.000");
                    System.out.println("====================================");
                    System.out.println("Minuman nomor :");
                    int minuman = scan.nextInt();
                    System.out.println("jumlah pesanan :");
                    int jm = scan.nextInt();
                    if (minuman == 1) {
                        total2 = total2 + 3000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 2) {
                        total2 = total2 + 4000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 3) {
                        total2 = total2 + 2000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 4) {
                        total2 = total2 + 3000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 5) {
                        total2 = total2 + 4000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 6) {
                        total2 = total2 + 3000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 7) {
                        total2 = total2 + 6000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 8) {
                        total2 = total2 + 6000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 9) {
                        total2 = total2 + 6000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 10) {
                        total2 = total2 + 6000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 11) {
                        total2 = total2 + 6000 * jm;
                        System.out.println(total2);
                    }
                    if (minuman == 12) {
                        total2 = total2 + 7000 * jm;
                        System.out.println(total2);
                    }
                    System.out.println(" tambah pesanan Y /N");
                    pilih = scan.next();
                }
            }

            if (input == 4) {
                seluruh = total1 + total2;
                System.out.println("Total biaya :" + seluruh);
            }

            if (input == 5) {
                total1 = 0;
                total2 = 0;
                seluruh = 0;
                System.out.println("total makanan :" + total1);
                System.out.println("total minuman :" + total2);
                System.out.println("total biaya :" + seluruh);
            }
            if (input == 6) {
                break;
            }
        }
    }
}
