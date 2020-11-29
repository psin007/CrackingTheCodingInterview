package ArraysAndStrings;

/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 * @author Pooja
 *
 */
public class IsUnique {

	public boolean allUnique(String word) {
		if (word.length() > 128) return false;
		boolean[] chars = new boolean[128];
		int charVal = 0;
		for(int i = 0; i < word.length(); i++) {
			charVal = word.charAt(i);
			if(!chars[charVal]) chars[charVal] = true;
			else return false;
		}
		return true;
	}
}
