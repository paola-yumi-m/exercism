class RotationalCipher {

	private int shiftKey;
	private String alphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
	private String alphabetUpperCase = alphabetLowerCase.toUpperCase();
	
    RotationalCipher(int shiftKey) {
    	if (shiftKey >= 26) {
    		this.shiftKey = shiftKey - 26;
    	} else {    		
    		this.shiftKey = shiftKey;
    	}
    }

    String rotate(String data) {
    	String rotated = "";
    	for (int i = 0; i < data.length(); i++) {    		
    		char letter = data.charAt(i);
    		int newIndex;
    		int indexPlusShiftKey = alphabetLowerCase.indexOf(String.valueOf(letter).toLowerCase()) + this.shiftKey;
    		if (indexPlusShiftKey >= 26) {
    			newIndex = indexPlusShiftKey - 26;
    		} else {
    			newIndex = indexPlusShiftKey;
    		}
    		if (Character.isUpperCase(letter) && alphabetUpperCase.contains(String.valueOf(letter))) {
    			rotated += alphabetUpperCase.charAt(newIndex);
    		} else if (!Character.isUpperCase(letter) && alphabetLowerCase.contains(String.valueOf(letter))) {
    			rotated += alphabetLowerCase.charAt(newIndex);
    		} else {
    			rotated += letter;
    		}
    	}
    	return rotated;
    }

}
