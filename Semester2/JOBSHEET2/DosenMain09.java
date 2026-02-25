public class DosenMain09 {
    public static void main(String[] args) {

        Dosen09 d1 = new Dosen09();
        d1.idDosen = "DS001";
        d1.nama = "Dr. Andi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Pemrograman";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Artificial Intelligence");
        d1.tampilInformasi();

        Dosen09 d2 = new Dosen09("DS002", "Dr. Sinta", true, 2018, "Basis Data");

        d2.tampilInformasi();
        d2.setStatusAktif(false);
        d2.tampilInformasi();
    }
}
