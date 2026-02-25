public class MataKuliahMain09 {
    public static void main(String[] args) {

        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah09 mk2 = new MataKuliah09("MK002", "Basis Data", 3, 6);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
