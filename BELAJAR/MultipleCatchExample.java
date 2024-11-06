public class MultipleCatchExample {
    public static void main(String[] args){
        try {
            int result = 10 / 0;
            System.out.println("Result:" + result);

            int[] number = {1, 2, 3};
            System.out.println("Number at index 5: " + number[5]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot devide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bound");
        }
    }
}
