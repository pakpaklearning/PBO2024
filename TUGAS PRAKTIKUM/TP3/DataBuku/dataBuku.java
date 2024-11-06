package TP3.DataBuku;

/**
 * dataBuku
 */
class buku {
    private String judul;
    private String pengarang;
    private double harga;

    // membuat construktor
    public buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // getter
    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public double getHarga() {
        return harga;
    }

    // membuat setter 
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}

public class dataBuku {
    public static void main(String[] args) {
        // objek buku
        buku buku1 = new buku("Harry Potter", "J.K. Rowling", 300000);
        buku buku2 = new buku("UML", "Ivar Jacobson", 400000);

        // header tabel
        System.out.println("+-------------------------+------------------+------------+");
        System.out.printf("| %-23s | %-16s | %-10s |\n", "Judul", "Pengarang", "Harga");
        System.out.println("+-------------------------+------------------+------------+");

        // data buku dalam tabel
        System.out.printf("| %-23s | %-16s | %-10.0f |\n", buku1.getJudul(), buku1.getPengarang(), buku1.getHarga());
        System.out.printf("| %-23s | %-16s | %-10.0f |\n", buku2.getJudul(), buku2.getPengarang(), buku2.getHarga());

        // penutup
        System.out.println("+-------------------------+------------------+------------+");
    }
}
