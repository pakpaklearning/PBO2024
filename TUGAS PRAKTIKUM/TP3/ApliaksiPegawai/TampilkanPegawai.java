package TP3.ApliaksiPegawai;

import java.util.ArrayList;

public class TampilkanPegawai {

    // method menampilkan semua pegawai
    public static void tampilkanSemuaPegawai(ArrayList<Pegawai> pegawaiSDM, ArrayList<Pegawai> pegawaiKeuangan, ArrayList<Pegawai> pegawaiProduksi) {
        System.out.println("\nPegawai Sumber Daya Manusia:");
        tampilkanPegawai(pegawaiSDM);

        System.out.println("\nPegawai Keuangan:");
        tampilkanPegawai(pegawaiKeuangan);

        System.out.println("\nPegawai Produksi:");
        tampilkanPegawai(pegawaiProduksi);
    }

    // method menampilkan pegawai berdasarkan departemen
    public static void tampilkanPegawaiPerDepartemen(ArrayList<Pegawai> listPegawai) {
        tampilkanPegawai(listPegawai);
    }

    // Method untuk menampilkan pegawai dalam list
    public static void tampilkanPegawai(ArrayList<Pegawai> listPegawai) {
        if (listPegawai.isEmpty()) {
            System.out.println("Tidak ada pegawai.");
        } else {
            for (Pegawai pegawai : listPegawai) {
                System.out.println(pegawai);
            }
        }
    }

    // method menampilkan pegawai berdasarkan range gaji
    public static void tampilkanPegawaiBerdasarkanGaji(ArrayList<Pegawai> pegawaiList, double gajiMinimum) {
        System.out.println("\nPegawai dengan gaji di atas " + gajiMinimum + ":");

        //mengecek apakah ada pegawai yang ditemukan
        boolean found = false; 
        for (Pegawai pegawai : pegawaiList) {
            if (pegawai.getGaji() > gajiMinimum) {
                System.out.println(pegawai);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada pegawai dengan gaji di atas " + gajiMinimum + ".");
        }
    }
}
