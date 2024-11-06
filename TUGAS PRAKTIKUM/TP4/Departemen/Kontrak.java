package TP4.Departemen;

// Kontrak
public class Kontrak extends Karyawan {
    private int waktu; 
    
    public Kontrak(String nama, int waktu, double gaDas) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display() {
        System.out.println("Karyawan Kontrak - Nama: " + nama + ", Gaji Dasar: " + gaDas + ", Waktu Kontrak: " + waktu + " bulan");
    }
}

