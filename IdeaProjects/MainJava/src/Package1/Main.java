package Package1;

public class Main {
    public static void main(String[] args) {
        String productName = "Pepsi";
        int length = productName.length();
        boolean letters = productName.contains("CocaCola");
        boolean endLetters = productName.endsWith("si");

        String message = "This is first string!. \"String\"";

        System.out.println(message);
        System.out.println(length);
        System.out.println(letters);
    }
}
