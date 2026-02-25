package JOBSHEET3;

import java.util.Scanner;

public class MataKuliahDemo09 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah09[] arrayMK = new Matakuliah09[jumlah];
      
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            arrayMK[i] = new Matakuliah09(kode, nama, sks, jumlahJam);
            arrayMK[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("-----------------------------");

            
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayMK[i].cetakInfo();
            System.out.println("-----------------------------");

        }


     

    }

}
