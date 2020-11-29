package ArraysAndStrings;
/**
 * 
 * Implement a method to perform basic String compression
 * using th ecounts of repeated characters. For example:
 * aabbbbccccc is a2b4c5. If the compressed string would 
 * not be smaller than original string, your method should
 * return original string. YOu can assume the string 
 * has only uppercase and lowercase leters.
 * @author Pooja
 *
 */
public class StringCompressionOptimal {
	
	public String stringCompression(String word) {
		int builderLength = compressedLength(word);
		if(builderLength >= word.length())
			return word;
		StringBuilder sb = new StringBuilder(builderLength);
		int countConsecutive = 0;
		for(int i = 0 ; i < word.length(); i++) {
			countConsecutive++;
			if(i + 1 >= word.length() || word.charAt(i) != word.charAt(i+1)) {
				sb.append(word.charAt(i));
				sb.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return sb.toString();
	}
	
	public int compressedLength(String s) {
		int countConsecutive = 0;
		int totalLength = 0;
		for(int i = 0; i < s.length(); i++) {
			countConsecutive++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				totalLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return totalLength;
				
	}

}
