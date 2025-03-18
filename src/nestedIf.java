public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        
        if (age >= 18) {
            if (hasID) {
                System.out.println("You can enter.");
            } else {
                System.out.println("ID required.");
            }
        } else {
            System.out.println("You are underage.");
        }
    }
}
