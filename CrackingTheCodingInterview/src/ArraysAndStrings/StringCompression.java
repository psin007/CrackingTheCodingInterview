package ArraysAndStrings;

/**
 * Implement a method to perform basic String compression
 * using th ecounts of repeated characters. For example:
 * aabbbbccccc is a2b4c5. If the compressed string would 
 * not be smaller than original string, your method should
 * return original string. YOu can assume the string 
 * has only uppercase and lowercase leters.
 * @author Pooja
 *
 */
public class StringCompression {

	public String compressString(String s) {
		StringBuilder sb = new StringBuilder();
		int consCount = 0;
		for(int i = 0 ; i < s.length();i++){
			consCount++;
			if(i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)) {
				sb.append(s.charAt(i));
				sb.append(consCount);
				consCount = 0;
			}
		}
		return sb.length() < s.length() ? sb.toString() : s;
	}
	
}
