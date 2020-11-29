package ArraysAndStrings;
/**
 * Rotate Matrix: Given an image reprsented by N*N matrix
 * where each pixel in image is 4 bytes,
 * write a method to rotate the image by 90 degrees.
 * Can it be done in place?
 * @author Pooja
 *
 */
public class RotateMatrix {

	public boolean rotateMatrix(int[][] m) {
		if(m.length == 0 || m.length != m[0].length)
			return false;
		
		int n = m.length;
		for(int layer = 0; layer < n/2 ;layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i < last; i++) {
				int offset = i-first;
				int top = m[first][i]; //save top
				//left - > top
				m[first][i] = m[last - offset][first];
				//bottom - > left
				m[last - offset][first] = m[last][last - offset];
				//right - > bottom
				m[last][last - offset] = m[i][last];
				//top - > right
				m[i][last] = top;
			}
		}
		return true;
	}
}
