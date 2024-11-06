package TP4.Karakter;

public class Karakter {
    protected String nama;
    protected int kekuatan;
    protected int level;
    protected int nyawa;
    protected int kapasitasNyawa;

    public Karakter(String nama, int level, int nyawa) {
        this.nama = nama; 
        this.level = level; 
        if (this instanceof Pejuang) {
            this.kekuatan = level * 15; 
            this.kapasitasNyawa = level * 30; 
        } else {
            this.kekuatan = level * 10; 
            this.kapasitasNyawa = level * 10; 
        }
        if (nyawa > this.kapasitasNyawa) this.nyawa = kapasitasNyawa;
        else this.nyawa = nyawa; 
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKekuatan() {
        return this.kekuatan;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
        if (this instanceof Pejuang) {
            this.kekuatan = level * 10; 
            this.kapasitasNyawa = level * 30; 
        } else {
            this.kekuatan = level * 10; 
            this.kapasitasNyawa = level * 10; 
        }
        this.nyawa = this.kapasitasNyawa;
    }

    public int getNyawa() { 
        return nyawa;
    }

    public void setNyawa(int nyawa) {
        if(nyawa > this.kapasitasNyawa) this.nyawa = this.kapasitasNyawa;
        else if(nyawa < 0) this.nyawa = 0;
        else this.nyawa = nyawa; 
    }

    public int getKapasitasNyawa() {
        return kapasitasNyawa;
    }

    public void serang() {
        if (this.nyawa > 0) {
            System.out.println(this.nama + " melakukan serangan dengan kekuatan " + this.kekuatan);
        } else {
            System.out.println(this.nama + " tidak bisa menyerang karena telah kalah.");
        }
    }

    public void bertahan() { 
        System.out.println(this.nama + " bertahan dari serangan!");
    }

    public void displayInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Kekuatan: " + this.kekuatan);
        System.out.println("Level: " + this.level);
        System.out.println("Nyawa: " + this.nyawa + "/" + this.kapasitasNyawa);
    }

    public void upgradeLevel() {
        level++;
        if (this instanceof Pejuang) {
            this.kekuatan += 15;
            this.kapasitasNyawa += 30;
            this.nyawa = kapasitasNyawa; 
        } else {
            kekuatan += 10;
            kapasitasNyawa += 5;
            nyawa = kapasitasNyawa;
            System.out.println(nama + " naik level! Level sekarang: " + level + ", Kekuatan: " + kekuatan + ", Nyawa: " + nyawa + "/" + kapasitasNyawa);
        }
    }

    public void terkenaSerangan(int damage) {
        nyawa -= damage;
        if (nyawa <= 0) {
            nyawa = 0;
            System.out.println(nama + " telah kalah.");
        } else {
            System.out.println(nama + " terkena serangan! Nyawa sekarang: " + nyawa + "/" + kapasitasNyawa);
        }
    }

    public void regenerasiNyawa() {
        nyawa += 20;
        if (nyawa > kapasitasNyawa) {
            nyawa = kapasitasNyawa;
            System.out.println(nama + " nyawa penuh. Kapasitas nyawa: " + kapasitasNyawa);
        } else {
            System.out.println(nama + " meregenerasi nyawa. Nyawa sekarang: " + nyawa + "/" + kapasitasNyawa);
        }
    }
}
