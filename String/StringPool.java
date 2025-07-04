package String;

public class StringPool {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, both refer to the same string literal in the pool
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, content is the same
        System.out.println("str1 == str3: " + (str1 == str3)); // false, str3 is a new object in heap memory
        System.out.println("str3 == str4: " + (str3 == str4)); // false, both are different objects in heap memory
    }
}
