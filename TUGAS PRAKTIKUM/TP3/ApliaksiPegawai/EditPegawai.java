package TP3.ApliaksiPegawai;

import java.util.Scanner;

public class EditPegawai {
    static Scanner scanner = new Scanner(System.in);

    // methode edit pegawai
    public static void editPegawai(Pegawai pegawai) {
        System.out.println("Pegawai ditemukan: " + pegawai);
        System.out.print("Masukkan Nama Baru (Kosongkan jika tidak ingin mengganti): ");
        String namaBaru = scanner.nextLine();
        if (!namaBaru.isEmpty()) {
            pegawai.setNama(namaBaru);
        }

        System.out.print("Masukkan Alamat Baru (Kosongkan jika tidak ingin mengganti): ");
        String alamatBaru = scanner.nextLine();
        if (!alamatBaru.isEmpty()) {
            pegawai.setAlamat(alamatBaru);
        }

        System.out.println("Pegawai berhasil diedit.");
    }
}
