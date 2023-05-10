
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
public class Nomor6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrFood = new String[10];
        String[] arrDrink = new String[10];
        int menu = 0;
        int food = 0;
        int drink = 0;
        int sum = 0;
        int totalFood = 0;
        int totalDrink = 0;
        String pilihan = "y";
        do {
            System.out.println("Depot JONO");
            System.out.println("1. Lihat menu");
            System.out.println("2. Pesan makanan");
            System.out.println("3. Pesan minuman");
            System.out.println("4. Tagihan");
            System.out.println("5. Hapus semua");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            menu = scan.nextInt();
            if (menu <= 0 || menu > 6) {
                do {
                    System.out.println("Menu tidak tersedia!");
                    System.out.print("Pilih menu : ");
                    menu = scan.nextInt();
                } while (menu <= 0 || menu > 6);
            }
            System.out.println(" ");
            if (menu == 1) {
                System.out.println("MENU MAKANAN :");
                System.out.println(" Nasi goreng ayam    Rp 15.000");
                System.out.println(" Nasi goreng telur   Rp 15.000");
                System.out.println(" Nasi goreng spesial Rp 18.000");
                System.out.println(" Nasi campur         Rp 15.000");
                System.out.println(" Nasi ayam kremes    Rp 15.000");
                System.out.println(" Nasi Rawon          Rp 15.000");
                System.out.println(" ");
                System.out.println("MENU MINUMAN :");
                System.out.println(" Es teh tawar        Rp 3.000");
                System.out.println(" Es teh manis        Rp 4.000");
                System.out.println(" Teh tawar hangat    Rp 2.000");
                System.out.println(" Teh manis hangat    Rp 3.000");
                System.out.println(" Es jeruk            Rp 4.000");
                System.out.println(" Jeruk hangat        Rp 3.000");
                System.out.println(" Jus apel            Rp 6.000");
                System.out.println(" Jus Tomat           Rp 6.000");
                System.out.println(" Jus Wortel          Rp 6.000");
                System.out.println(" Jus kulit manggis   Rp 6.000");
                System.out.println(" Jus melon           Rp 6.000");
                System.out.println(" Soda gembira        Rp 7.000");
                System.out.println(" ");
            }
            if (menu == 2) {
                System.out.println("MENU MAKANAN :");
                System.out.println("1. Nasi goreng ayam    Rp 15.000");
                System.out.println("2. Nasi goreng telur   Rp 15.000");
                System.out.println("3. Nasi goreng spesial Rp 18.000");
                System.out.println("4. Nasi campur         Rp 15.000");
                System.out.println("5. Nasi ayam kremes    Rp 15.000");
                System.out.println("6. Nasi Rawon          Rp 15.000");
                System.out.println(" ");
                do {
                    for (int a = 0; a < arrFood.length; a++) {
                        System.out.println("Masukkan nomor makanan yang dipesan");
                        System.out.println(" ");
                        System.out.print("Makanan nomor  : ");
                        food = scan.nextInt();
                        if (food < 1 || food > 6) {
                            do {
                                System.out.println("Pilihan tidak tersedia!");
                                System.out.print("Makanan nomor  : ");
                                food = scan.nextInt();
                            } while (food < 1 || food > 6);
                        }
                        if (arrFood[9] != null) {
                            System.out.println("Tagihan melebihi batas!");
                            pilihan = "n";
                            break;
                        }
                        System.out.print("Jumlah pesanan : ");
                        sum = scan.nextInt();
                        if (food == 1 || food == 2 || food == 4 || food == 5 || food == 6) {
                            totalFood = totalFood + (15000 * sum);
                        }
                        if (food == 3) {
                            totalFood = totalFood + (18000 * sum);
                        }
                        if (food == 1) {
                            arrFood[a] = sum + " Nasi goreng ayam    " + 15000;
                        }
                        if (food == 2) {
                            arrFood[a] = sum + " Nasi goreng telur   " + 15000;
                        }
                        if (food == 3) {
                            arrFood[a] = sum + " Nasi goreng spesial " + 18000;
                        }
                        if (food == 4) {
                            arrFood[a] = sum + " Nasi campur         " + 15000;
                        }
                        if (food == 5) {
                            arrFood[a] = sum + " Nasi ayam kremes    " + 15000;
                        }
                        if (food == 6) {
                            arrFood[a] = sum + " Nasi Rawon          " + 15000;
                        }
                        System.out.println(" ");
                        System.out.println("Tambah pesanan ? (y/n) ");
                        pilihan = scan.next();
                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                } while (pilihan.equalsIgnoreCase("y"));
            }
            if (menu == 3) {
                System.out.println("MENU MINUMAN :");
                System.out.println(" 1. Es teh tawar       Rp 3.000");
                System.out.println(" 2. Es teh manis       Rp 4.000");
                System.out.println(" 3. Teh tawar hangat   Rp 2.000");
                System.out.println(" 4. Teh manis hangat   Rp 3.000");
                System.out.println(" 5. Es jeruk           Rp 4.000");
                System.out.println(" 6. Jeruk hangat       Rp 3.000");
                System.out.println(" 7. Jus apel           Rp 6.000");
                System.out.println(" 8. Jus Tomat          Rp 6.000");
                System.out.println(" 9. Jus Wortel         Rp 6.000");
                System.out.println("10. Jus kulit manggis  Rp 6.000");
                System.out.println("11. Jus melon          Rp 6.000");
                System.out.println("12. Soda gembira       Rp 7.000");
                System.out.println(" ");
                do {
                    for (int a = 0; a < arrDrink.length; a++) {
                        System.out.println("Masukkan nomor minuman yang dipesan");
                        System.out.println(" ");
                        System.out.print("Minuman nomor  : ");
                        drink = scan.nextInt();
                        if (drink < 1 || drink > 12) {
                            do {
                                System.out.println("Pilihan tidak tersedia!");
                                System.out.print("Minuman nomor  : ");
                                drink = scan.nextInt();
                            } while (drink < 1 || drink > 12);
                        }
                        if (arrDrink[9] != null) {
                            System.out.println("Tagihan melebihi batas!");
                            pilihan = "n";
                            break;
                        }
                        System.out.print("Jumlah pesanan : ");
                        sum = scan.nextInt();
                        if (drink == 1 || drink == 4 || drink == 6) {
                            totalDrink = totalDrink + (3000 * sum);
                        }
                        if (drink == 2 || drink == 5) {
                            totalDrink = totalDrink + (4000 * sum);
                        }
                        if (drink == 3) {
                            totalDrink = totalDrink + (2000 * sum);
                        }
                        if (drink == 7 || drink == 8 || drink == 9 || drink == 10 || drink == 11) {
                            totalDrink = totalDrink + (6000 * sum);
                        }
                        if (drink == 12) {
                            totalDrink = totalDrink + (7000 * sum);
                        }
                        if (drink == 1) {
                            arrDrink[a] = sum + " Es teh tawar        " + 3000;
                        }
                        if (drink == 2) {
                            arrDrink[a] = sum + " Es teh manis        " + 4000;
                        }
                        if (drink == 3) {
                            arrDrink[a] = sum + " Teh tawar hangat    " + 2000;
                        }
                        if (drink == 4) {
                            arrDrink[a] = sum + " Teh manis hangat    " + 3000;
                        }
                        if (drink == 5) {
                            arrDrink[a] = sum + " Es jeruk            " + 4000;
                        }
                        if (drink == 6) {
                            arrDrink[a] = sum + " Jeruk hangat        " + 3000;
                        }
                        if (drink == 7) {
                            arrDrink[a] = sum + " Jus apel            " + 6000;
                        }
                        if (drink == 8) {
                            arrDrink[a] = sum + " Jus tomat           " + 6000;
                        }
                        if (drink == 9) {
                            arrDrink[a] = sum + " Jus wortel          " + 6000;
                        }
                        if (drink == 10) {
                            arrDrink[a] = sum + " Jus kulit manggis   " + 6000;
                        }
                        if (drink == 11) {
                            arrDrink[a] = sum + " Jus melon           " + 6000;
                        }
                        if (drink == 12) {
                            arrDrink[a] = sum + " Soda gembira        " + 7000;
                        }
                        System.out.println(" ");
                        System.out.println("Tambah pesanan ? (y/n) ");
                        pilihan = scan.next();
                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                } while (pilihan.equalsIgnoreCase("y"));
            }
            if (menu == 4) {
                System.out.println("Tagihan");
                for (int a = 0; a < arrFood.length; a++) {
                    if (arrFood[a] != null) {
                        System.out.println(arrFood[a]);
                    }
                }
                for (int a = 0; a < arrDrink.length; a++) {
                    if (arrDrink[a] != null) {
                        System.out.println(arrDrink[a]);
                    }
                }
                System.out.println(" ");
                System.out.println("Total biaya makanan : Rp " + totalFood);
                System.out.println("Total biaya minuman : Rp " + totalDrink);
                System.out.println("Total biaya : Rp " + (totalFood + totalDrink));
                System.out.println("");
            }
            if (menu == 5) {
                totalFood = 0;
                totalDrink = 0;
                for (int a = 0; a < 10; a++) {
                    arrFood[a] = null;
                    arrDrink[a] = null;
                }
            }
            if (menu == 6) {
                break;
            }
        } while (menu >= 1 && menu <= 6);
    }
}