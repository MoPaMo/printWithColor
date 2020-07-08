import java.util.TreeMap;

public class printWithColor {
	private static boolean alreadyBooted = false;
	private static TreeMap<String, String> colorValues = new TreeMap<>();
	private static TreeMap<String, String> bgValues = new TreeMap<>();

	private static void bootArray() {
		colorValues.put("BLACK", "\u001B[30m");
		colorValues.put("RED", "\u001B[31m");
		colorValues.put("GREEN", "\u001B[32m");
		colorValues.put("YELLOW", "\u001B[33m");
		colorValues.put("BLUE", "\u001B[34m");
		colorValues.put("PURPLE", "\u001B[35m");
		colorValues.put("CYAN", "\u001B[36m");
		colorValues.put("WHITE", "\u001B[37m");
		bgValues.put("BLACK", "\u001B[40m");
		bgValues.put("RED", "\u001B[41m");
		bgValues.put("GREEN", "\u001B[42m");
		bgValues.put("YELLOW", "\u001B[43m");
		bgValues.put("BLUE", "\u001B[44m");
		bgValues.put("PURPLE", "\u001B[45m");
		bgValues.put("CYAN", "\u001B[46m");
		bgValues.put("WHITE", "\u001B[47m");
		alreadyBooted = true;
	}

	public static void printC(String term, String color, String bg) {
		if (!alreadyBooted)
			bootArray();
		System.out.println(bgValues.get(bg) +colorValues.get(color) + term + "\u001B[0m"); // Prints the string to the console.

	}
}
