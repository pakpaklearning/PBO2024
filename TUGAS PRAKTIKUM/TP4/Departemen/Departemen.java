package TP4.Departemen;

// Departemen
import java.util.ArrayList;
import java.util.List;

public class Departemen {
    private String nama;
    private List<Karyawan> kar; 

    public Departemen(String nama) {
        this.nama = nama;
        this.kar = new ArrayList<>();
    }

    public void addKaryawan(Karyawan k) {
        kar.add(k);
    }

    public void displayAll() {
        System.out.println("Semua Karyawan di Departemen " + nama + ":");
        for (Karyawan k : kar) {
            k.display();
        }
    }

    public void displayKontrak() {
        System.out.println("Karyawan Kontrak di Departemen " + nama + ":");
        for (Karyawan k : kar) {
            if (k instanceof Kontrak) {
                k.display();
            }
        }
    }

    public void displayTetap() {
        System.out.println("Karyawan Tetap di Departemen " + nama + ":");
        for (Karyawan k : kar) {
            if (k instanceof Tetap) {
                k.display();
            }
        }
    }
}

