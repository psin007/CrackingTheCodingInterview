package ArraysAndStrings;

/**
 * Zero Matrix: Write an algorithm such that if an element
 * in an M*N matrix is 0, its entire row and column are set to 0
 * @author Pooja
 *
 */
public class ZeroMatrixOptimal {

	void setZeroes(int[][] matrix) {
		boolean rowHasZero = false; //for first row only
		boolean columnHasZero = false; //for first column only
		
		//check if first row has zero
		for(int j = 0 ; j < matrix[0].length; j++) {
			if(matrix[0][j] == 0) {
				rowHasZero = true;
				break;
			}
		}
		
		//check if first column has zero
		for(int i = 0 ; i  < matrix.length ; i++) {
			if(matrix[i][0] == 0) {
				columnHasZero = true;
				break;
			}
		}
		
		//check for zeroes in remaining array
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		//Nullify rows based on first column
		for(int i = 1; i < matrix.length; i++) {
			if(matrix[i][0] == 0)
				nullifyRow(matrix,i);
		}
		
		//Nullify column based on first row
		for(int j = 1; j < matrix[0].length; j++) {
			if(matrix[0][j] == 0)
				nullifyColumn(matrix, j);
		}
		
		if(rowHasZero)
			nullifyRow(matrix,0);
		if(columnHasZero)
			nullifyColumn(matrix,0);
		
	}

	public void nullifyRow(int[][] m, int row) {
		for(int j = 0; j < m[0].length ; j++) {
			m[row][j] = 0;
		}
	}

	public void nullifyColumn(int[][]m , int col) {
		for(int i = 0 ; i < m.length ; i++) {
			m[i][col] = 0;
		}
	}
	
}

