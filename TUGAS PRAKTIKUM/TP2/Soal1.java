package TP2;

import java.util.Scanner;

public class Soal1 {

    // menghitung luas permukaan balok
    public static double hitungLuasPermukaanBalok(double sisi1, double sisi2, double sisi3) {
        return 2 * (sisi1 * sisi2 + sisi1 * sisi3 + sisi2 * sisi3);
    }

    // menghitung volume balok
    public static double hitungVolumeBalok(double sisi1, double sisi2, double sisi3) {
        return sisi1 * sisi2 * sisi3;
    }

    // menghitung luas permukaan bola
    public static double hitungLuasPermukaanBola(double jariJari) {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    // menghitung volume bola
    public static double hitungVolumeBola(double jariJari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int menu;

        do {
            // Menampilkan menu
            System.out.println("Hitung Bangun Ruang: ");
            System.out.println("1. Hitung Luas dan Volume Balok");
            System.out.println("2. Hitung Luas dan Volume Bola");
            System.out.println("3. Keluar Aplikasi");
            System.out.print("Pilih Menu: ");
            menu = s.nextInt();

            switch (menu) {
                case 1:
                    // Input sisi balok
                    System.out.print("Masukkan Sisi 1: ");
                    double sisi1 = s.nextDouble();
                    System.out.print("Masukkan Sisi 2: ");
                    double sisi2 = s.nextDouble();
                    System.out.print("Masukkan Sisi 3: ");
                    double sisi3 = s.nextDouble();

                    // luas permukaan dan volume balok
                    double luasBalok = hitungLuasPermukaanBalok(sisi1, sisi2, sisi3);
                    double volumeBalok = hitungVolumeBalok(sisi1, sisi2, sisi3);

                    // Menampilkan hasil
                    System.out.println("Luas Permukaan Balok: " + luasBalok);
                    System.out.println("Volume Balok: " + volumeBalok);
                    break;

                case 2:
                    // Input jari-jari bola
                    System.out.print("Masukkan Jari-Jari Bola: ");
                    double jariJari = s.nextDouble();

                    // luas permukaan dan volume bola
                    double luasBola = hitungLuasPermukaanBola(jariJari);
                    double volumeBola = hitungVolumeBola(jariJari);

                    // Menampilkan hasil
                    System.out.println("Luas Permukaan Bola: " + luasBola);
                    System.out.println("Volume Bola: " + volumeBola);
                    break;

                case 3:
                    System.out.println("Keluar dari Aplikasi.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
            System.out.println(); 
        } while (menu != 3);

        s.close(); 
    }
}
