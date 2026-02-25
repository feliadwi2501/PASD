package JOBSHEET3;
import java.util.Scanner;
public class DosenDemo09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen09[] arrayOfDosen = new Dosen09[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

       
        for (Dosen09 dosen : arrayOfDosen) {
             System.out.println("\n=== DATA DOSEN ===");
             dosen.cetakInfo();
        }
        DataDosen09 dataDosen = new DataDosen09();
        System.out.println("\n===== ANALISIS DATA DOSEN =====");
        
        dataDosen.jumlahDosenperJenisKelamin(arrayOfDosen);
        dataDosen.rataRataUsiaDosenperJenisKelamin(arrayOfDosen);
        dataDosen.DosenTertua(arrayOfDosen);     
        dataDosen.DosenTermuda(arrayOfDosen);
    }
}
