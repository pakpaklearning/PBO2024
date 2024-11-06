import java.util.ArrayList;

public class Travel {
    private String paket;
    private Kendaraan kendaraan;
    private Hotel hotel;
    private ArrayList<TempatWisata> tempatWisataList = new ArrayList<>();
    private ArrayList<String> travellerList = new ArrayList<>();

    public Travel(String paket, Kendaraan kendaraan, Hotel hotel) {
        this.paket = paket;
        this.kendaraan = kendaraan;
        this.hotel = hotel;
    }

    public void addWisata(TempatWisata tempatWisata) {
        tempatWisataList.add(tempatWisata);
    }

    public void addTraveller(String namaTraveller) {
        travellerList.add(namaTraveller);
    }

    public void displayData() {
        System.out.println("Nama Paket: " + paket);
        System.out.println("Kendaraan: " + kendaraan.getJenis() + " (Kapasitas: " + kendaraan.getKapasitas() + ")");
        System.out.println("Penginapan: " + hotel.getNama() + " (Biaya: " + hotel.getBiayaPerMalam() + " Beri )");
        
        System.out.println("\nDaftar Tempat Wisata:");
        for (TempatWisata tw : tempatWisataList) {
            System.out.println("- " + tw.getNama() + " (Biaya: " + tw.getBiaya() + " Beri )");
        }

        System.out.println("\nDaftar Traveller:");
        for (String traveller : travellerList) {
            System.out.println("- " + traveller);
        }
    }

    public String getPaket() {
        return paket;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public ArrayList<TempatWisata> getTempatWisataList() {
        return tempatWisataList;
    }

    public ArrayList<String> getTravellerList() {
        return travellerList;
    }
}
