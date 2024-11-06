
public class main {
    public static void main(String[] args) {
        //pembuatan objek tempat wisata
        TempatWisata tw1 = new TempatWisata ("Dressrosa", 500);
        TempatWisata tw2 = new TempatWisata ("Water Seven", 300);
        TempatWisata tw3 = new TempatWisata ("Sabaody Archipelago", 200);

        //pembuatan objek untuk traveller
        Traveller tl1 = new Traveller("Luffy", "East Blue");
        Traveller tl2 = new Traveller("Zoro", "East Blue");
        Traveller tl3 = new Traveller("Nami", "East Blue");
        Traveller tl4 = new Traveller("Usopp", "East Blue");
        Traveller tl5 = new Traveller("Sanji", "Nort Blue");
        Traveller tl6 = new Traveller("Chopper", "Paradise");
        Traveller tl7 = new Traveller("Robin", "West Blue");
        Traveller tl8 = new Traveller("Franky", "Paradise");
        Traveller tl9 = new Traveller("Brook", "West Blue");
        Traveller tl10 = new Traveller("Jinbe", "Paradise");

        //pembuatan objek Travel Pertama
        //berelasi komposisi dengan class Kendaraan dan htel
        Travel tr1 = new Travel("Paket 1" , new Kendaraan ("Caravel" , 50), new Hotel("Alabasta Hotel", 50));
        
        //menambahkan tempat wisata pada objek tr1
        //berelasi agregasi dengan class tempatwisata
        tr1.addWisata(tw1);
        tr1.addWisata(tw2);

        //menambahkan traveller pada objek tr1
        //berelasi asosiasi dengan class traveller
        tr1.addTraveller(tl1.getNama());
        tr1.addTraveller(tl2.getNama());
        tr1.addTraveller(tl3.getNama());
        tr1.addTraveller(tl4.getNama());
        tr1.addTraveller(tl5.getNama());
        tr1.addTraveller(tl6.getNama());

        //pambuatan untuk objek travel ke 2
        //berelasi komposisi dengan class kendaraan hotel
        Travel tr2 = new Travel ("Paket 2", new Kendaraan ("Cruise Ship", 100), new Hotel ("Mermaid Hotel", 40));

        //menambahkan tempat wisata pada objek tr2
        //berelasi agregasi dengan class TempatWisata
        tr2.addWisata(tw1);
        tr2.addWisata(tw2);
        tr2.addWisata(tw3);

        //menambahkan traveller pada objektr2
        //berelasi asosiasi dengan class traveller
        tr2.addTraveller(tl7.getNama());
        tr2.addTraveller(tl8.getNama());
        tr2.addTraveller(tl9.getNama());
        tr2.addTraveller(tl10.getNama());

        System.out.println("\n\n-----Data ke 1 ------");
        tr1.displayData();
        //menampilkan data paket1
        System.out.println("\n\n-----Data ke 2 ------");
        tr2.displayData();
        






    }
    
}