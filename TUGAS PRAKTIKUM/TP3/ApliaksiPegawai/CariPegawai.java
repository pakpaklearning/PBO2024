package TP3.ApliaksiPegawai;
import java.util.ArrayList;

public class CariPegawai {

    // methode mencari pegawai berdasarkan ID
    public static Pegawai cariPegawaiById(String id, ArrayList<Pegawai> pegawaiSDM, ArrayList<Pegawai> pegawaiKeuangan, ArrayList<Pegawai> pegawaiProduksi) {
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

    // methode menampilkan pegawai berdasarkan range gaji
    public static void tampilkanPegawaiDalamRange(ArrayList<Pegawai> pegawaiSDM, ArrayList<Pegawai> pegawaiKeuangan, ArrayList<Pegawai> pegawaiProduksi, double gajiBawah, double gajiAtas) {
        tampilkanPegawaiDalamRange(pegawaiSDM, gajiBawah, gajiAtas);
        tampilkanPegawaiDalamRange(pegawaiKeuangan, gajiBawah, gajiAtas);
        tampilkanPegawaiDalamRange(pegawaiProduksi, gajiBawah, gajiAtas);
    }

    public static void tampilkanPegawaiDalamRange(ArrayList<Pegawai> listPegawai, double gajiBawah, double gajiAtas) {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai.getGaji() >= gajiBawah && pegawai.getGaji() <= gajiAtas) {
                System.out.println(pegawai);
            }
        }
    }
}

