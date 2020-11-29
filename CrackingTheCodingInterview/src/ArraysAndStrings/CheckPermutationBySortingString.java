package ArraysAndStrings;

public class CheckPermutationBySortingString {

	public boolean permutation(String s1, String s2) {
		if(s1.length() != s2.length())	return false;
		
		return sortString(s1).equals(sortString(s2));
	} 
	
	public String sortString(String s) {
		char[] charArray = s.toCharArray();
		java.util.Arrays.sort(charArray);
		return new String(charArray);
	}
}
