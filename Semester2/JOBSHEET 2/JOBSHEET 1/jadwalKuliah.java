package sem2;
import java.util.Scanner;
public class jadwalKuliah {
    // Fungsi input data jadwal
    public static void inputJadwal(String[][] jadwal, int n, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari Kuliah      : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam Kuliah       : ");
            jadwal[i][3] = input.nextLine();
        }
    }
    // Fungsi menampilkan semua jadwal
    public static void tampilkanSemua(String[][] jadwal, int n) {
        System.out.println("\n===== JADWAL KULIAH =====");
        System.out.printf("%-25s %-15s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-15s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    // Fungsi menampilkan jadwal berdasarkan hari
    public static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada jadwal");
        }
    }
    // Fungsi menampilkan jadwal berdasarkan nama mata kuliah
    public static void cariMataKuliah(String[][] jadwal, int n, String mk) {
        boolean ada = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Mata kuliah tidak ditemukan");
        }
    }
    // Main program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, input);
        tampilkanSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = input.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama mata kuliah: ");
        String mk = input.nextLine();
        cariMataKuliah(jadwal, n, mk);

        input.close();
    }
}

