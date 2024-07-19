package labEx1;

public class LabEx1_5 {
    public static void main(String[] args) {
        String testString = "Hello World";

        System.out.println("charAt(4): " + testString.charAt(4));

        System.out.println("contains(\"World\"): " + testString.contains("World"));

        System.out.println("length(): " + testString.length());

        System.out.println("indexOf('o'): " + testString.indexOf('o'));

        System.out.println("equals(\"hello world\"): " + testString.equals("hello world"));

        System.out.println("equalsIgnoreCase(\"hello world\"): " + testString.equalsIgnoreCase("hello world"));

        System.out.println("join(\", \", \"Hello\", \"World\"): " + String.join(", ", "Hello", "World"));

        System.out.println("lastIndexOf('o'): " + testString.lastIndexOf('o'));

        System.out.println("substring(6): " + testString.substring(6));

        System.out.println("toLowerCase(): " + testString.toLowerCase());

        System.out.println("toUpperCase(): " + testString.toUpperCase());

        String withSpaces = "  Hello World  ";
        System.out.println("trim(): '" + withSpaces.trim() + "'");
    }

}
