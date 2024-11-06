package TP4.Karakter;
import java.util.ArrayList;

public class SoalFix {
    public static void main(String[] args) {
        ArrayList<Karakter> daftarKarakter = new ArrayList<>();
        Karakter karakter1 = new Karakter("Nevan", 20, 300);
        daftarKarakter.add(karakter1);

        // Tambahkan beberapa karakter
        Pejuang warrior = new Pejuang("Agatha", 50, 100); 
        Pejuang warrior2 = new Pejuang("Argus", 20, 80); 
        daftarKarakter.add(warrior); 
        daftarKarakter.add(warrior2); 

        // Menampilkan informasi karakter
        System.out.println("--- Daftar Karakter ---");
        for (Karakter karakter : daftarKarakter) {
            karakter.displayInfo();
            System.out.println();
        }

        // Aksi karakter
        System.out.println("--- Aksi Karakter ---");
        karakter1.serang();
        karakter1.bertahan();
        karakter1.regenerasiNyawa();

        warrior.setEnergi(0);
        warrior.serang(); 
        warrior.skillSerang();
        warrior.regenerasiEnergi();
        warrior.skillSerang();
        warrior.bertahan();

        warrior2.terkenaSerangan(warrior2.getNyawa()); 
        warrior2.serang(); 

        // upgrade level
        System.out.println("\n--- Upgrade Level ---");
        karakter1.upgradeLevel();
        warrior.upgradeLevel(); 

        // terkena serangan
        System.out.println("\n--- Terkena Serangan ---");
        karakter1.terkenaSerangan(30);
        warrior.terkenaSerangan(30); 

        // regenerasi 
        System.out.println("\n--- Regenerasi ---");
        karakter1.regenerasiNyawa();
        warrior.regenerasiNyawa();
        warrior.regenerasiEnergi(); 
    }
}
