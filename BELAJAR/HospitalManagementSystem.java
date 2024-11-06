class Pasien {

    private String id;
    private String nama;
    private String kondisi;

    public Pasien(String id, String nama, String kondisi) {
        this.id = id;
        this.nama = nama;
        this.kondisi = kondisi;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}

class Dokter {
    private String id;
    private String nama;
    private String spesialisasi;
    private String[] namaPasien;
    private int jumlahPasien;
    private int kapasitasPasien;

    public Dokter(String id, String nama, String spesialisasi, int kapasitasPasien) {
        this.id = id;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.kapasitasPasien = kapasitasPasien;
        this.namaPasien = new String[this.kapasitasPasien];
        this.jumlahPasien = 0;
    }

    public void tambahPasien(String namaPasien) {
        if (jumlahPasien < this.kapasitasPasien) {
            this.namaPasien[jumlahPasien] = namaPasien;
            jumlahPasien++;
        }
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public int getJumlahPasien() {
        return jumlahPasien;
    }

    public String getIdPasien(int index) {
        if (index < jumlahPasien) {
            return namaPasien[index];
        }
        return null;
    }
}

class RumahSakit {
    private String nama;
    private Dokter[] daftarDokter;
    private int jumlahDokter;
    private int kapasitasDokter;

    public RumahSakit(String nama, int kapasitasDokter) {
        this.nama = nama;
        this.daftarDokter = new Dokter[kapasitasDokter];
        this.jumlahDokter = 0;
        this.kapasitasDokter = kapasitasDokter;
    }

    public void tambahDokter(Dokter dokter) {
        if (this.jumlahDokter < this.kapasitasDokter) {
            this.daftarDokter[jumlahDokter] = dokter;
            jumlahDokter++;
        }
    }

    public void tampilkanDaftarDokter() {
        System.out.println("Daftar Dokter Di " + nama + ": ");
        for (int i = 0; i < jumlahDokter; i++) {
            Dokter dokter = this.daftarDokter[i];
            System.out.println(dokter.getId() + "- Dr. " + dokter.getNama() + "(Spesialisasi: " + dokter.getSpesialisasi() + ")");
        }
    }

    public Dokter getDokter(int index) {
        if (index < jumlahDokter) {
            return this.daftarDokter[index];
        }
        return null;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlahDokter() {
        return this.jumlahDokter;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {

        // Membuat Objek RumahSakit
        RumahSakit rs = new RumahSakit("RS Sejahtera", 50);

        // Menambahkan Beberapa Dokter
        Dokter dokter1 = new Dokter("D001", "Zidane", "Bedah", 2);
        Dokter dokter2 = new Dokter("D002", "Rahman", "Anak", 1);
        Dokter dokter3 = new Dokter("D003", "Adam", "Kandungan", 100);
        Dokter dokter4 = new Dokter("D004", "Farid", "Kandungan", 2);
        Dokter dokter5 = new Dokter("D005", "Zidane", "Tulang", 2);

        rs.tambahDokter(dokter1);
        rs.tambahDokter(dokter2);
        rs.tambahDokter(dokter3);
        rs.tambahDokter(dokter4);
        rs.tambahDokter(dokter5);

        // Menampilkan daftar Dokter di RumahSakit
        rs.tampilkanDaftarDokter();
        System.out.println();

        // Menambahkan beberapa Pasien untuk setiap Dokter
        Pasien pasien1 = new Pasien("P001", "Deni", "Demam");
        Pasien pasien2 = new Pasien("P002", "Eka", "Flu");
        Pasien pasien3 = new Pasien("P003", "Fani", "Sakit Kepala");
        Pasien pasien4 = new Pasien("P004", "Gita", "Mual");
        Pasien pasien5 = new Pasien("P005", "Hadi", "Batuk");
        Pasien pasien6 = new Pasien("P006", "Ika", "Pusing");
        Pasien pasien7 = new Pasien("P007", "Joko", "Sakit Mata");
        Pasien pasien8 = new Pasien("P008", "Kiki", "Telinga Berdengung");

        dokter1.tambahPasien(pasien1.getNama());
        dokter1.tambahPasien(pasien2.getNama());
        dokter2.tambahPasien(pasien3.getNama());
        dokter2.tambahPasien(pasien4.getNama());
        dokter3.tambahPasien(pasien5.getNama());
        dokter4.tambahPasien(pasien6.getNama());
        dokter4.tambahPasien(pasien7.getNama());
        dokter5.tambahPasien(pasien8.getNama());

        // Menampilkan daftar Pasien untuk setiap Dokter
        System.out.println("Daftar Pasien untuk setiap Dokter:");
        for (int i = 0; i < rs.getJumlahDokter(); i++) {
            Dokter dokter = rs.getDokter(i);
            System.out.println("Pasien Dr. " + dokter.getNama() + ":");
            for (int j = 0; j < dokter.getJumlahPasien(); j++) {
                System.out.println("- " + dokter.getIdPasien(j));
            }
            System.out.println();
        }

        // Memperbarui kondisi Pasien
        pasien1.setKondisi("Demam Tinggi");
        pasien2.setKondisi("Flu Ringan");
        pasien5.setKondisi("Batuk Parah");

        // Menampilkan kondisi terbaru dari Pasien
        System.out.println("Riwayat kondisi terbaru pasien:");
        System.out.println(pasien1.getNama() + ": " + pasien1.getKondisi());
        System.out.println(pasien2.getNama() + ": " + pasien2.getKondisi());
        System.out.println(pasien5.getNama() + ": " + pasien5.getKondisi());
        System.out.println();
    }
}
