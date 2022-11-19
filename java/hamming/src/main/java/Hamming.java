public class Hamming {
	private String leftStrand;
	private String rightStrand;
	
	public Hamming(String leftStrand, String rightStrand) {
		this.leftStrand = leftStrand;
		this.rightStrand = rightStrand;
		if (this.leftStrand.length() == 0 && this.rightStrand.length() != 0) {			
			throw new IllegalArgumentException("left strand must not be empty.");
		} 
		else if (this.leftStrand.length() != 0 && this.rightStrand.length() == 0) {			
			throw new IllegalArgumentException("right strand must not be empty.");
		}
		else if (this.leftStrand.length() > this.rightStrand.length() || this.leftStrand.length() < this.rightStrand.length()) { 
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
	}

	
	
    public String getLeftStrand() {
		return leftStrand;
	}



	public void setLeftStrand(String leftStrand) {
		this.leftStrand = leftStrand;
	}



	public String getRightStrand() {
		return rightStrand;
	}



	public void setRightStrand(String rightStrand) {
		this.rightStrand = rightStrand;
	}



	public int getHammingDistance() {
		
		if (leftStrand.equals("") && rightStrand.equals("")) {
			return 0;
		} else {
			int counter = 0;
			for (int i = 0; i < leftStrand.length(); i++) {
				if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
					counter++;
				}
			}
			return counter;
		}
	}


}
