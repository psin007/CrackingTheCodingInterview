package ArraysAndStrings;

import java.util.HashMap;

/**
 * Given a string, write a function to check if it is a 
 * permutation of a palindrome. A palindrome is a word 
 * or phrase that is same forwards and backwards. A permutation is a 
 * rearrangement of letters. The palindrome does not need to be
 * limited to just dictionary words.
 * Eg:
 * Input: Tact Coa
 * Output: True [taco cat]
 * @author Pooja
 *
 */

public class PalindromePermutation {

	public boolean palindromePermutation(String str) {
		int oddCount = 0; 
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c: str.toLowerCase().toCharArray()) {
			if(c != ' ') {
				if(map.containsKey(c)) {
					map.put(c,map.get(c) +1);
					
				}else {
					map.put(c, 1);
				}
			}
		}
		for(int count: map.values()) {
			if(count % 2 != 0)	oddCount++;
		}
		
		if(oddCount > 1) return false;
		return true;
	}
}
