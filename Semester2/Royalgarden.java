package sem2;
public class Royalgarden {
    // Fungsi untuk menghitung pendapatan cabang
    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        return (aglonema * hargaAglonema) +
               (keladi * hargaKeladi) +
               (alocasia * hargaAlocasia) +
               (mawar * hargaMawar);
    }
    // Fungsi untuk menentukan status cabang
    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        String[] cabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        int[][] stok = {
                {10, 5, 15, 7},
                {6, 11, 9, 12},
                {2, 10, 10, 5},
                {5, 7, 12, 9}
        };

        System.out.println("LAPORAN PENDAPATAN ROYAL GARDEN");
        System.out.println("================================================");

        for (int i = 0; i < cabang.length; i++) {

            int pendapatan = hitungPendapatan(
                    stok[i][0], // Aglonema
                    stok[i][1], // Keladi
                    stok[i][2], // Alocasia
                    stok[i][3]  // Mawar
            );
            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + statusCabang(pendapatan));
        }
    }
}
