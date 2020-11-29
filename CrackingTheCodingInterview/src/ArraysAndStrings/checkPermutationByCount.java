package ArraysAndStrings;

public class checkPermutationByCount {

	public boolean permutation(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		int[] letters = new int[128];
		for(char c : s1.toCharArray()) {
			letters[c]++;
		}
		for(int i = 0; i < s2.length(); i++) {
			int c = (int) s2.charAt(i);
			letters[c] --;
			if(letters[c] < 0) return false;
		}
		return true;
	}

	
}

