import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Contoh validasi berdasarkan spesifikasi
        
        // a. Validasi integer dengan rentang angka min dan max: 250, 10, 200
        int intValue = 250;
        System.out.println("Validasi Integer: " + Validator.validate(intValue, 10, 200)); // Output: false

        // b. Validasi double dengan rentang angka min dan max : 2.8, 1.0, dan 4.0
        double doubleValue = 2.8;
        System.out.println("Validasi Double: " + Validator.validate(doubleValue, 1.0, 4.0)); // Output: true

        // c. Validasi max Panjang string : “hello”, 10
        String stringValue = "hello";
        System.out.println("Validasi Panjang String: " + Validator.validate(stringValue, 10)); // Output: true

        // d. Validasi format string input yang diizinkan: “Waiting”, [“Pending”, “Approve”, “Reject”]
        String status = "Waiting";
        List<String> allowedStatuses = List.of("Pending", "Approve", "Reject");
        System.out.println("Validasi Format String: " + Validator.validate(status, allowedStatuses)); // Output: false
    }
}
