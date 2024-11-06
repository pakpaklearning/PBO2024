public class Segitiga {
    public double hitung(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double hitungLuas(double alas, double sisi) {
        double tinggi = Math.sqrt((sisi * sisi) - ((alas / 2) * (alas / 2)));
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling(double sisi) {
        return 3 * sisi;
    }
}