

public class Hotel {
    private String nama;
    private int biayaPerMalam;

    public Hotel(String nama, int biayaPerMalam) {
        this.nama = nama;
        this.biayaPerMalam = biayaPerMalam;
    }

    public String getNama() {
        return nama;
    }

    public int getBiayaPerMalam() {
        return biayaPerMalam;
    }
}
