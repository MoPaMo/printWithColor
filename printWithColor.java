import java.util.TreeMap;
public class printWithColor {
	private static TreeMap<String, String> colorValues = new TreeMap<>();
	private static void bootArray(){
		colorValues.put("BLACK", "\u001B[30m");
                colorValues.put("RED", "\u001B[31m");
                colorValues.put("GREEN", "\u001B[32m");
                colorValues.put("YELLOW", "\u001B[33m");
                colorValues.put("BLUE", "\u001B[34m");
		}
	public static void printC() {
        	bootArray();
        	System.out.println(colorValues.get("YELLOW")+"Hello World!"+"\u001B[0m"); // Prints the string to the console.

    }
}
