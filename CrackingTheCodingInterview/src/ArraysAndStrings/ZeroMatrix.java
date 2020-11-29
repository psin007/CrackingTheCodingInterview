package ArraysAndStrings;
/**
 * Zero Matrix: Write an algorithm such that if an element
 * in an M*N matrix is 0, its entire row and column are set to 0 
 * @author Pooja
 *
 */
public class ZeroMatrix {
	
	public void zeroMatrix(int[][] matrix) {
		
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		//Store values of rows and columns which has 0
		
		for(int i = 0; i< matrix.length; i++) {
			for(int j = 0 ; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//nullify rows
		for(int i = 0; i < row.length; i++) {
			if(row[i])
				nullifyRow(matrix,i);
				
		}
		//nullify columns
		for(int j = 0; j < column.length; j++) {
			if(column[j])
				nullifyColumn(matrix,j);
		}
	}
	
	public void nullifyRow(int[][] m, int row) {
		for(int j = 0 ; j < m[0].length; j++) {
			m[row][j] = 0;
		}
	}
	
	public void nullifyColumn(int[][] m, int column) {
		for(int i = 0 ; i < m.length; i++) {
			m[i][column] = 0;
		}
	}

}
