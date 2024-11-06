public class Lingkaran {
    public static final double PI = 3.14159;

    public double hitungLuas(float jejari) {
        return PI * jejari * jejari;
    }

    public double hitungLuas(double diameter) {
        double jejari = diameter / 2;
        return PI * jejari * jejari;
    }

    public double hitungKeliling(float jejari) {
        return 2 * PI * jejari;
    }

    public double hitungKeliling(double diameter) {
        return PI * diameter;
    }
}