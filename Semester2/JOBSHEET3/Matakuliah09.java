package JOBSHEET3;

public class Matakuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah09(String kode, String nama, int sks, int jumlahJam) {// dengan parameter
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(String kode, String nama, int sks, int jam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode MK : " + kode);
        System.out.println("Nama MK : " + nama);
        System.out.println("SKS     : " + sks);
        System.out.println("----------------------");
    }

}
