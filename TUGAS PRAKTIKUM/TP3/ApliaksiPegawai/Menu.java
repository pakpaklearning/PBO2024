package TP3.ApliaksiPegawai;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void inputPegawai(ArrayList<Pegawai> pegawaiSDM, ArrayList<Pegawai> pegawaiKeuangan, ArrayList<Pegawai> pegawaiProduksi) {
        System.out.print("Masukkan ID Pegawai: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Pegawai: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat Pegawai: ");
        String alamat = scanner.nextLine();
        System.out.println("Pilih Departemen (1. SDM, 2. Keuangan, 3. Produksi): ");
        int deptChoice = scanner.nextInt();
        scanner.nextLine(); 
        String departemen = "";
        switch (deptChoice) {
            case 1:
                departemen = "Sumber Daya Manusia";
                break;
            case 2:
                departemen = "Keuangan";
                break;
            case 3:
                departemen = "Produksi";
                break;
            default:
                System.out.println("Departemen tidak valid!");
                return;
        }
        System.out.print("Masukkan Gaji Pegawai: ");
        double gaji = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Pegawai pegawaiBaru = new Pegawai(id, nama, alamat, departemen, gaji);

        if (departemen.equals("Sumber Daya Manusia")) {
            pegawaiSDM.add(pegawaiBaru);
        } else if (departemen.equals("Keuangan")) {
            pegawaiKeuangan.add(pegawaiBaru);
        } else if (departemen.equals("Produksi")) {
            pegawaiProduksi.add(pegawaiBaru);
        }
        System.out.println("Pegawai berhasil ditambahkan.");
    }
}
