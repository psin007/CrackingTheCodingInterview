package ArraysAndStrings;

/**
 * URLify: A method to replace all spaces in a string with '%20'. 
 * May assume that string has sufficient space at end to hold additional 
 * characters. YOu are also given true length of string
 * Task requires you to perform it in place.
 * eg:
 * Input "Mr John Smith    "
 * Output "Mr%20John%20Smith" 
 * @author Pooja
 *
 */
public class URLify {

	public String urlify(String str, int trueLength ) {
		int spaceCount = 0; 
		int index, i = 0;
		
		char[] s = str.toCharArray();
		
		for(i = 0; i < trueLength; i++) {
			if(s[i] == ' ') spaceCount++;
		}
		
		index = trueLength + spaceCount * 2;
		
		for(i = trueLength - 1; i > 0; i--) {
			if(s[i] != ' ') {
				//copy last word from trueLength to last of complete string which is at index
				s[index - 1] = s[i];
				index--;
			}
			else {
				s[index - 1] = '0';
				s[index - 2] = '2';
				s[index - 3] = '%';
				index = index - 3;
			}
		}
		//ideally should have no return type as it is in-place 
		//but for demonstration and testing purposes.
		return new String(s);
	}
}
