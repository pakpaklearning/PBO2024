package TP2;
import java.util.ArrayList;
import java.util.Scanner;

public class Nilai {
    private static ArrayList<ArrayList<Integer>> nilaiKelas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Menu");
            System.out.println("1. Masukan Nilai");
            System.out.println("2. Lihat Nilai Tersimpan");
            System.out.println("3. Lihat Statistik Nilai");
            System.out.println("4. Keluar");
            menu = s.nextInt();

            switch (menu) {
                case 1:
                    masukanNilai(s);
                    break;

                case 2:
                    lihatNilai();
                    break;

                case 3:
                    lihatStatistikNilai(s);
                    break; 

                case 4:
                    System.out.println("Terimakasih");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (menu != 4);
    }

    private static void masukanNilai(Scanner s) {
        ArrayList<Integer> nilai = new ArrayList<>();
        int input;
        System.out.println("Masukkan nilai (ketik -1 untuk berhenti): ");
        do {
            input = s.nextInt();
            if (input != -1) {
                nilai.add(input);
            }
        } while (input != -1);

        if (!nilai.isEmpty()) {
            nilaiKelas.add(nilai);
            System.out.println("Nilai berhasil dimasukkan.");
        } else {
            System.out.println("Tidak ada nilai yang dimasukkan.");
        }
    }

    private static void lihatNilai() {
        if (nilaiKelas.isEmpty()) {
            System.out.println("Tidak ada data nilai.");
        } else {
            for (int i = 0; i < nilaiKelas.size(); i++) {
                System.out.println("Nilai Kelas " + (i + 1) + ": " + nilaiKelas.get(i));
            }
        }
    }

    private static void lihatStatistikNilai(Scanner s) {
        if (nilaiKelas.isEmpty()) {
            System.out.println("Tidak ada data nilai.");
            return;
        }

        System.out.println("Pilih nomor kelas (1-" + nilaiKelas.size() + "): ");
        int nomorKelas = s.nextInt();
        if (nomorKelas < 1 || nomorKelas > nilaiKelas.size()) {
            System.out.println("Nomor kelas tidak valid.");
            return;
        }

        ArrayList<Integer> nilai = nilaiKelas.get(nomorKelas - 1);
        tampilkanStatistik(nilai, "Kelas " + nomorKelas);
    }

    private static void tampilkanStatistik(ArrayList<Integer> nilai, String deskripsi) {
        if (nilai.isEmpty()) {
            System.out.println("Tidak ada data nilai untuk " + deskripsi);
            return;
        }

        int total = 0;
        int tertinggi = nilai.get(0);
        int terendah = nilai.get(0);

        for (int n : nilai) {
            total += n;
            if (n > tertinggi) {
                tertinggi = n;
            }
            if (n < terendah) {
                terendah = n;
            }
        }

        double rataRata = total / (double) nilai.size();
        System.out.println("Statistik " + deskripsi + ": ");
        System.out.println("Rata-Rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
    }
}
