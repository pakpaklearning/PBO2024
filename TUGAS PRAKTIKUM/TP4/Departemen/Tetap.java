package TP4.Departemen;

// Tetap
public class Tetap extends Karyawan {
    private double tuDas; 

    public Tetap(String nama, double tuDas, double gaDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        System.out.println("Karyawan Tetap - Nama: " + nama + ", Gaji Dasar: " + gaDas + ", Tunjangan Dasar: " + tuDas);
    }
}

