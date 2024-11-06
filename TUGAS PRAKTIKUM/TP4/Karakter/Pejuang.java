package TP4.Karakter;

public class Pejuang extends Karakter {
    private int armor;
    private int kekuatanSkill;
    private int energi; 
    private int kapasitasEnergi; 

    public Pejuang(String nama, int level, int nyawa) {
        super(nama, level, nyawa);
        this.armor = level * 10;
        this.kekuatanSkill = level * 5;
        this.kapasitasEnergi = level * 30;
        this.energi = this.kapasitasEnergi;
    }

    public int getEnergi() {
        return energi;
    }

    public void setEnergi(int energi) {
        if (energi > this.kapasitasEnergi) this.energi = this.kapasitasEnergi;
        else if(energi < 0) this.energi = 0;
        else this.energi = energi; 
    }

    public void skillSerang() {
        if (nyawa > 0) {
            if (energi > 0) {
                System.out.println(nama + " melakukan serangan dengan skill kekuatan " + (this.kekuatan + this.kekuatanSkill));
                energi -= 10; 
            } else {
                System.out.println(nama + " tidak bisa menyerang karena energi habis!");
            }
        } else {
            System.out.println(nama + " tidak bisa menyerang karena telah kalah.");
        }
    }

    public void regenerasiEnergi() {
        energi += 20;
        if (energi > kapasitasEnergi) {
            energi = kapasitasEnergi;
            System.out.println(nama + " energi penuh. Kapasitas energi: " + kapasitasEnergi);
        } else {
            System.out.println(nama + " meregenerasi energi. Energi sekarang: " + energi);
        }
    }

    @Override
    public void upgradeLevel() {
        super.upgradeLevel();
        this.armor += 10;
        this.kekuatanSkill += 5;
        this.kapasitasEnergi += 30;
        this.energi = this.kapasitasEnergi;
        System.out.println(this.nama + " naik level! Level sekarang: " + this.level + ", Kekuatan: " + this.kekuatan + ", Nyawa: " + this.nyawa + "/" + this.kapasitasNyawa + ", Armor: " + this.armor + ", Kekuatan Skill: " + this.kekuatanSkill + ", Energi: " + this.energi + "/" + this.kapasitasEnergi);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Armor: " + this.armor);
        System.out.println("Skill Kekuatan: " + this.kekuatanSkill);
        System.out.println("Energi: " + energi + "/" + kapasitasEnergi);
    } 
}
