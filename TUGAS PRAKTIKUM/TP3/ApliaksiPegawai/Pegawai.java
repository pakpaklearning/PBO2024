package TP3.ApliaksiPegawai;

public class Pegawai {
    private String id;
    private String nama;
    private String alamat;
    private String departemen;
    private double gaji;

    // constructor
    public Pegawai(String id, String nama, String alamat, String departemen, double gaji) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.gaji = gaji;
    }

    // method getter
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getGaji() {
        return gaji;
    }

    // method setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Alamat: " + alamat + ", Departemen: " + departemen + ", Gaji: " + gaji;
    }
}

