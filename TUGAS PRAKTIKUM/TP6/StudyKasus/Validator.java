import java.util.List;

public class Validator {
    
    // 1. Validasi integer dengan rentang min dan max
    public static boolean validate(int value, int min, int max) {
        return value >= min && value <= max;
    }

    // 2. Validasi double dengan rentang min dan max
    public static boolean validate(double value, double min, double max) {
        return value >= min && value <= max;
    }

    // 3. Validasi panjang maksimum string
    public static boolean validate(String input, int maxLength) {
        return input.length() <= maxLength;
    }

    // 4. Validasi format string input yang diizinkan
    public static boolean validate(String input, List<String> allowedValues) {
        return allowedValues.contains(input);
    }
}
