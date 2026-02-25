package JOBSHEET3;
import java.util.Scanner;
public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Mahasiswa09 [] arrayOfMahasiswa09 = new Mahasiswa09[3];
        Scanner sc = new Scanner(System.in);
        String dummy;
        

        for (int i=0; i < 3; i++) {
            arrayOfMahasiswa09[i] = new Mahasiswa09();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM: ");
            arrayOfMahasiswa09[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrayOfMahasiswa09[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrayOfMahasiswa09[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa09[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
            
        }
        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
          arrayOfMahasiswa09[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}

  

 

