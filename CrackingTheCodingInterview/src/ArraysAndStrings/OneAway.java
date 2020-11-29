package ArraysAndStrings;

/**
 * There are three types of edits that can be performed on strings;
 * insert a character
 * remove a character
 * replace a character
 * Given two Strings, write a function to check if they are
 * one edit(or zero edits) away
 * 
 * Example:
 * pale, ple -> true
 * pales, pale - > true
 * pale,bale -> true
 * pale, bae -> false
 * @author Pooja
 *
 */
public class OneAway {
	
	public boolean oneAway(String s1, String s2) {
		
		if(s1.length() - s2.length() == 0)
			return checkReplace(s1,s2);
		else if (s1.length() - s2.length() == 1)
			return checkInsert(s1,s2);
		else if(s1.length() + 1 == s2.length())
			return checkInsert(s2,s1);
		return false;
	}

	public boolean checkReplace(String s1, String s2) {
		boolean unequalChar = false;
		int i = 0;
		while(i < s1.length()) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(unequalChar)
					return false;
				unequalChar = true;
			}
			i++;
		}
		return true;
	}
	
	public boolean checkInsert(String s1, String s2) {
		int i = 0,j = 0;
		while(i < s1.length() && j < s2.length()) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(i != j)
					return false;
				i++;
			}
			else {
				i++;
				j++;
			}
		}
		return true;
	}
}
