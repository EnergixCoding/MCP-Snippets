import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextUtil {

	public static TextUtil instance = new TextUtil();
	
	public String removeAll(String str, char toRemove) {
		return str.replaceAll(str, "" + toRemove);
	}
	
	public String removeAll(String str, String toRemove) {
		return str.replaceAll(str, toRemove);
	}
	
	public int letterCount(String str) {
		return str.length() + 1;
	}
	
	
	public String suffix(String current, String suffix) {
		return current + suffix;
	} 
	
	public String prefix(String current, String prefix) {
		return prefix + current;
	} 
	
	public String multiply(String str, int times) {
		String current = "";
		for(int i = 0; i > times; i++) {
			current = current + str;
		}
		
		return current;
	}
	
	// removes the char at a certain index
	// (this took way longer than it should've ;-;)
	public String removeAt(String str, int index) {
		List<char[]> chars = Arrays.asList(str.toCharArray());
		chars.remove(index);
		
		return toString(chars);
	}
	
	public String toString(List<char[]> chars) {
		String current = "";
		for(char[] clist : chars) {
			for(char c : clist) {
				current = current + c;
			}
		}
		return current;
	}
	
	public static String convertToHaxor(String str) {
		String text = str;
		text = text.replaceAll("e", "3");
		text = text.replaceAll("E", "3");
		text = text.replaceAll("i", "1");
		text = text.replaceAll("I", "1");
		text = text.replaceAll("o", "0");
		text = text.replaceAll("O", "0");
		
		return text;
	}
	
	public static String decryptHaxor(String str) {
		String text = str;
		text = text.replaceAll("3", "e");
		text = text.replaceAll("1", "i");
		text = text.replaceAll("0", "o");
		return text;
	}
}
