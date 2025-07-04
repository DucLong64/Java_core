package Pass_Mechanism;

public class pass_in_value {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before change: " + a); // Output: 10
        changeValue(a);
        System.out.println("After change: " + a); // Output: 10, remains
    }
    public static void changeValue(int a) {
        a = 20; // This change will not affect the original variable 'a' in main
    }
}
