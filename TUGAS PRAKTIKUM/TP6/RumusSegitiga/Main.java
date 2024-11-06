
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Segitiga segitiga = new Segitiga();
        
        while (true) {
            System.out.println("Pilih perhitungan:");
            System.out.println("1. Hitung berdasarkan alas dan tinggi");
            System.out.println("2. Hitung berdasarkan alas dan sisi");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 3) {
                System.out.println("Keluar dari program.");
                break;
            }

            System.out.print("Masukkan alas: ");
            double alas = scanner.nextDouble();

            if (pilihan == 1) {
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.println("Luas: " + segitiga.hitungLuas(alas, tinggi));
                System.out.println("Keliling: " + segitiga.hitungKeliling(alas));
            } else if (pilihan == 2) {
                System.out.print("Masukkan sisi: ");
                double sisi = scanner.nextDouble();
                System.out.println("Luas: " + segitiga.hitungLuas(alas, sisi));
                System.out.println("Keliling: " + segitiga.hitungKeliling(sisi));
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        
        scanner.close();
    }
}