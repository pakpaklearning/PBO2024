package TP3.ApliaksiPegawai;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Pegawai> pegawaiSDM = new ArrayList<>();
    static ArrayList<Pegawai> pegawaiKeuangan = new ArrayList<>();
    static ArrayList<Pegawai> pegawaiProduksi = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Menu Aplikasi Pegawai ---");
            System.out.println("1. Input Pegawai");
            System.out.println("2. Edit Pegawai");
            System.out.println("3. Tampilkan Semua Data Pegawai");
            System.out.println("4. Tampilkan Pegawai Per Departemen");
            System.out.println("5. Tampilkan Pegawai Berdasarkan Range Gaji");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (pilihan) {
                case 1:
                    Menu.inputPegawai(pegawaiSDM, pegawaiKeuangan, pegawaiProduksi);
                    break;
                case 2:
                    editPegawai();  // Memanggil metode edit pegawai
                    break;
                case 3:
                    TampilkanPegawai.tampilkanSemuaPegawai(pegawaiSDM, pegawaiKeuangan, pegawaiProduksi);
                    break;
                case 4:
                    System.out.print("Pilih Departemen (1. SDM, 2. Keuangan, 3. Produksi): ");
                    int deptChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (deptChoice == 1) {
                        TampilkanPegawai.tampilkanPegawaiPerDepartemen(pegawaiSDM);
                    } else if (deptChoice == 2) {
                        TampilkanPegawai.tampilkanPegawaiPerDepartemen(pegawaiKeuangan);
                    } else if (deptChoice == 3) {
                        TampilkanPegawai.tampilkanPegawaiPerDepartemen(pegawaiProduksi);
                    } else {
                        System.out.println("Departemen tidak valid!");
                    }
                    break;
                case 5:
                    System.out.print("Masukkan gaji minimum: ");
                    double gajiMinimum = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    TampilkanPegawai.tampilkanPegawaiBerdasarkanGaji(pegawaiSDM, gajiMinimum);
                    TampilkanPegawai.tampilkanPegawaiBerdasarkanGaji(pegawaiKeuangan, gajiMinimum);
                    TampilkanPegawai.tampilkanPegawaiBerdasarkanGaji(pegawaiProduksi, gajiMinimum);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    // Method untuk edit pegawai
    public static void editPegawai() {
        System.out.print("Masukkan ID Pegawai yang ingin diedit: ");
        String id = scanner.nextLine();

        Pegawai pegawai = cariPegawaiById(id);
        if (pegawai == null) {
            System.out.println("Pegawai tidak ditemukan.");
            return;
        }

        EditPegawai.editPegawai(pegawai);
    }

    // Method untuk mencari pegawai berdasarkan ID
    public static Pegawai cariPegawaiById(String id) {
        for (Pegawai pegawai : pegawaiSDM) {
            if (pegawai.getId().equals(id)) {
                return pegawai;
            }
        }
        for (Pegawai pegawai : pegawaiKeuangan) {
            if (pegawai.getId().equals(id)) {
                return pegawai;
            }
        }
        for (Pegawai pegawai : pegawaiProduksi) {
            if (pegawai.getId().equals(id)) {
                return pegawai;
            }
        }
        return null;
    }
}
