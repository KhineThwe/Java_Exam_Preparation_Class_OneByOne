public class IfEventOdd {
    public static void main(String[] args) {
        int num = 15;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else {
            System.out.println("Negative number");
        }
    }
}
