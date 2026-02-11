package sem2;
import java.util.Scanner;
public class PraktikumPerulanganArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        // Ambil 2 digit terakhir
        int panjang = nim.length();
        int n = Integer.parseInt(nim.substring(panjang - 2));
        // Jika n < 10 tambah 10
        if (n < 10) {
            n = n + 10;
        }
        System.out.println("n = " + n);
        // Membuat array dari 1 sampai n
        int[] angka = new int[n];

        for (int i = 0; i < n; i++) {
            angka[i] = i + 1;
        }
        System.out.println("Output:");
        // Menampilkan sesuai aturan
        for (int i = 0; i < n; i++) {
            // Skip 10 dan 15
            if (angka[i] == 10 || angka[i] == 15) {
                continue;
            }

            if (angka[i] % 3 == 0) {
                System.out.print("# ");
            } 
            else if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + " ");
            } 
            else {
                System.out.print("* ");
            }
        }
    }
}
