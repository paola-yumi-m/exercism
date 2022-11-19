class Matrix {

	private String matrix[];
	
    Matrix(String matrixAsString) {
    	String all[] = matrixAsString.split("\n");
    	this.matrix = all;
    }

    int[] getRow(int rowNumber) {
    	int numberOfColumns = this.matrix[0].split(" ").length;
    	String columns[] = new String[numberOfColumns];
    	int result[] = new int[numberOfColumns];
    	columns = matrix[rowNumber-1].split(" ");
    	for (int column=0; column < columns.length; column++) {
    		result[column] = Integer.valueOf(columns[column]);
    	}
    	return result;
    }

    int[] getColumn(int columnNumber) {
    	int numberOfRows = this.matrix.length;
    	int rows[] = new int[numberOfRows];
    	for (int row=0; row < numberOfRows; row++) {
    		rows[row] = Integer.valueOf(matrix[row].split(" ")[columnNumber-1]);
    	}
    	return rows;
    }
}
