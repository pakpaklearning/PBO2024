package TP4.Departemen;

// Main
public class Main {
    public static void main(String[] args) {
        // objek Departemen
        Departemen departemenIT = new Departemen("IT");

        // objek KaryawanTetap dan KaryawanKontrak
        Tetap karyawanTetap1 = new Tetap("Zidane", 1000000, 5000000);
        Tetap karyawanTetap2 = new Tetap("Octo", 1500000, 6000000);
        Kontrak karyawanKontrak1 = new Kontrak("Arya", 12, 3000000);
        Kontrak karyawanKontrak2 = new Kontrak("Farid", 6, 2500000);

        // menambahkan karyawan ke dalam departemen
        departemenIT.addKaryawan(karyawanTetap1);
        departemenIT.addKaryawan(karyawanTetap2);
        departemenIT.addKaryawan(karyawanKontrak1);
        departemenIT.addKaryawan(karyawanKontrak2);

        // tampilkan karyawan 
        System.out.println("Departemen IT:");
        departemenIT.displayTetap();
        departemenIT.displayKontrak();
        departemenIT.displayAll();
    }
}

