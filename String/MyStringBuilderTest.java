package String;

public class MyStringBuilderTest {
    public static void main(String[] args) {
        String str1 =" ";
        String str2 = str1;
        str1 = "Hello";
        System.out.println("str1 == str2: " + (str1 == str2));

        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2 = sb1;
        sb1.append("Hello");
        sb2.append("World");
        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // true, both refer to the same StringBuilder object
        System.out.println("sb1: " + sb1.toString()); // HelloWorld
        System.out.println("sb2: " + sb2.toString()); // HelloWorld

        StringBuffer sbf1 = new StringBuffer();
        sbf1.append("Anh Long");
        System.out.println("sbf1: " + sbf1.toString()); // Anh Long

        //Conmpare StringBuilder and StringBuffer: StringBuilder is not synchronized, StringBuffer is synchronized.

    }

}
