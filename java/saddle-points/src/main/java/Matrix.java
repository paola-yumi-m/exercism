import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
	
	private List<List<Integer>> matrix;
	
    Matrix(List<List<Integer>> values) {
    	this.matrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
    	Set<MatrixCoordinate> result = new HashSet<MatrixCoordinate>();
    	for (int row = 0; row < this.matrix.size(); row++) {
    		for (int col = 0; col < this.matrix.get(0).size(); col++) {
    			MatrixCoordinate el = new MatrixCoordinate(row+1, col+1);
    			int value = this.matrix.get(row).get(col);
    			int counter_row = 0;
    			for (int it_col = 0; it_col < this.matrix.get(0).size(); it_col++) {
    				MatrixCoordinate compare_col_el = new MatrixCoordinate(row+1, it_col+1);
    				int value_col = this.matrix.get(row).get(it_col);
    				if (value < value_col && el.compareTo(compare_col_el) != 0) {
    					counter_row += 1;
    				}
    			};
    			int counter_col = 0;
    			for (int it_row = 0; it_row < this.matrix.size(); it_row++) {
    				MatrixCoordinate compare_row_el = new MatrixCoordinate(it_row+1, col+1);
    				int value_row = this.matrix.get(it_row).get(col);
    					if (value > value_row && el.compareTo(compare_row_el) != 0) {
    						counter_col += 1;
    					}
    			}
    			if (counter_row == 0 && counter_col == 0) {
    				result.add(el);
    			}
    		}
    			
    	}
    	return result;
    }
}
