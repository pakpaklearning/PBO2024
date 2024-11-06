public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException akan dilempar
    }
}
