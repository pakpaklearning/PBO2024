public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("Luas lingkaran dengan jejari 7: " + lingkaran.hitungLuas(7));
        System.out.println("Keliling lingkaran dengan jejari 7: " + lingkaran.hitungKeliling(7));

        System.out.println("Luas lingkaran dengan jejari 5.5: " + lingkaran.hitungLuas(5.5f));
        System.out.println("Keliling lingkaran dengan jejari 5.5: " + lingkaran.hitungKeliling(5.5f));

        System.out.println("Luas lingkaran dengan diameter 20.4: " + lingkaran.hitungLuas(20.4));
        System.out.println("Keliling lingkaran dengan diameter 20.4: " + lingkaran.hitungKeliling(20.4));
    }
}