import java.util.ArrayList;

class Nurse {
    private String id;
    private String name;

    public Nurse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void tampilkanInfoNurse() {
        System.out.println("ID Perawat: " + id);
        System.out.println("Nama Perawat: " + name);
        System.out.println();
    }
}

class Hospital {
    private String name;
    private String location;
    private ArrayList<Nurse> daftarNurse;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.daftarNurse = new ArrayList<>();
    }

    public void tambahNurse(Nurse nurse) {
        daftarNurse.add(nurse);
    }

    public void tampilkanInfoHospital() {
        System.out.println("Nama Rumah Sakit: " + name);
        System.out.println("Lokasi: " + location);
        System.out.println("Daftar Perawat:");
        for (int i = 0; i < daftarNurse.size(); i++) {
            Nurse nurse = daftarNurse.get(i);
            System.out.println((i + 1) + ". " + nurse.getName() + " (ID: " + nurse.getId() + ")");
        }
        System.out.println();
    }
}

public class dataSuster {
    public static void main(String[] args) {
        Hospital hospital1 = new Hospital("RS Telkom", "Bandung");
        Hospital hospital2 = new Hospital("RS Telkom Medika", "Jakarta");

        Nurse nurse1 = new Nurse("N001", "Zidane");
        Nurse nurse2 = new Nurse("N002", "Octo");
        hospital1.tambahNurse(nurse1);
        hospital1.tambahNurse(nurse2);

        Nurse nurse3 = new Nurse("N003", "Zidane");
        Nurse nurse4 = new Nurse("N004", "Adam");
        hospital2.tambahNurse(nurse3);  
        hospital2.tambahNurse(nurse4);

        System.out.println("Data Rumah Sakit dan Perawat:");
        hospital1.tampilkanInfoHospital();
        hospital2.tampilkanInfoHospital();
    }
}
