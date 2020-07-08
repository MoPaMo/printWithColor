import java.util.HashMap;
public class printWithColor {
    private HashMap<String, String> map = new HashMap<String, String>();
    public static void printC() {
        System.out.println("\u001B[32mHello World!"+"\u001B[0m"); // Prints the string to the console.
    }
}
