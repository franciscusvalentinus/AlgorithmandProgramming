
import java.util.Scanner;

/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 */
/**
 *
 * @author franciscusvalentinus
 */
public class Nomor5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String database[][] = new String[9][6];
        int pilih = 0;

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Reservasi kamar");
            System.out.println("2. Batalkan pesanan");
            System.out.println("3. Lihat kamar");
            System.out.println("4. Exit");
            System.out.print("pilih : ");
            pilih = scan.nextInt();
            int pesanKamar = 0;

            if (pilih == 1) {
                while (true) {
                    System.out.println("==========================");
                    for (int i = 0; i < database.length; i++) {

                        //untuk cetak enter
                        if (i % 3 == 0 && i != 0) {
                            System.out.println("");
                        }
                        //untuk cetak kamar
                        if (database[i][0] == null) {
                            System.out.print("[ ]");
                        } else {
                            System.out.print("[*]");
                        }
                    }
                    System.out.println("");
                    //input data
                    System.out.print("pesan kamar nomor (0 untuk back) : ");
                    pesanKamar = scan.nextInt();
                    if (pesanKamar == 0) {
                        break;
                    } else {
                        pesanKamar--;
                        if (database[pesanKamar][0] != null) {
                            System.out.println("!! kamar telah terisi oleh " + database[pesanKamar][1] + " selama " + database[pesanKamar][5] + " hari !!");
                        } else {
                            database[pesanKamar][0] = "*";
                            System.out.print("Nama : ");
                            database[pesanKamar][1] = scan.next() + scan.nextLine();
                            System.out.print("Alamat : ");
                            database[pesanKamar][2] = scan.next() + scan.nextLine();
                            System.out.print("No. KTP : ");
                            database[pesanKamar][3] = scan.next() + scan.nextLine();
                            System.out.print("No. Telp : ");
                            database[pesanKamar][4] = scan.next() + scan.nextLine();
                            System.out.print("Lama menginap (dalam hari) : ");
                            database[pesanKamar][5] = scan.next() + scan.nextLine();
                            System.out.println("Data telah tersimpan!\n" + "(kembali ke menu awal)");
                            break;
                        }
                    }
                }
            } else if (pilih == 2) {
                while (true) {
                    //tampilan
                    System.out.println("=============================");
                    System.out.println("Batal pesanan");
                    for (int i = 0; i < database.length; i++) {
                        //untuk cetak enter
                        if (i % 3 == 0 && i != 0) {
                            System.out.println("");
                        }
                        //untuk cetak kamar
                        if (database[i][0] == null) {
                            System.out.print("[ ]");
                        } else {
                            System.out.print("[*]");
                        }
                    }
                    System.out.println("");
                    System.out.print("Batal kamar nomor (0 untuk back) : ");
                    pesanKamar = scan.nextInt();
                    if (pesanKamar != 0) {
                        pesanKamar--;
                        if (database[pesanKamar][0] == null) {
                            System.out.println("!! kamar nomor " + (pesanKamar + 1) + " tidak ada yang pesan !!");
                        } else {
                            System.out.println("Apakah anda yakin? (y/t) : ");
                            String yakin = scan.next();
                            if (yakin.equalsIgnoreCase("Y")) {
                                System.out.println("!! pesanan oleh " + database[pesanKamar][1] + " telah dibatalkan !!");
                                for (int i = 0; i < database[pesanKamar].length; i++) {
                                    database[pesanKamar][i] = null;
                                }
                                System.out.println("(kembali ke menu utama)");
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (pilih == 3) {
                System.out.println("=============================");
                System.out.println("Lihat kamar");
                for (int i = 0; i < database.length; i++) {
                    //untuk cetak enter
                    if (i % 3 == 0 && i != 0) {
                        System.out.println("");
                    }
                    //untuk cetak kamar
                    if (database[i][0] == null) {
                        System.out.print("[ ]");
                    } else {
                        System.out.print("[*]");
                    }
                }
                System.out.println("");
                for (int i = 0; i < database.length; i++) {
                    if (database[i][0] != null) {
                        System.out.println("Kamar no " + (i + 1) + " dipesan oleh " + database[i][1] + " selama " + database[i][5] + " hari");
                    }
                }
            }
            else if (pilih == 4){
                break;
            }
        }
    }
}
