import java.util.ArrayList;

class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

class ProgramStudi {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ProgramStudi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tampilkanInfoProgramStudi() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Daftar mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + mhs.getNim() + " - " + mhs.getNama());
        }
    }
}

public class dataMahasiswa {
    public static void main(String[] args) {
        ProgramStudi d3if = new ProgramStudi("D3IF", "D3 Rekayasa Perangkat Lunak Aplikasi");

        d3if.tambahMahasiswa(new Mahasiswa("4701", "Zidane"));
        d3if.tambahMahasiswa(new Mahasiswa("4702", "Octo"));
        d3if.tambahMahasiswa(new Mahasiswa("4703", "Rahman"));

        ProgramStudi d3si = new ProgramStudi("D3SI", "D3 Sistem Informasi");

        d3si.tambahMahasiswa(new Mahasiswa("4301", "Arya"));
        d3si.tambahMahasiswa(new Mahasiswa("4302", "Farid"));
        d3si.tambahMahasiswa(new Mahasiswa("4303", "Meydi"));
        d3si.tambahMahasiswa(new Mahasiswa("4304", "Daffa"));

        d3if.tampilkanInfoProgramStudi();
        System.out.println();
        d3si.tampilkanInfoProgramStudi();
    }
}
