public class Main {
    public static void main(String[] args) {
        int num = 5, fact = 1;
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }
}
