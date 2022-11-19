class SqueakyClean {
    static String clean(String identifier) {

    	String formatted_string = identifier;
    	
    	for (int i=0; i < identifier.length(); i++) {
    		char letter = identifier.charAt(i);
    		if (Character.isWhitespace(letter)) {
    			formatted_string = formatted_string.replace(String.valueOf(letter), "_");
    		}
    		
    		if (Character.isHighSurrogate(letter) || Character.isLowSurrogate(letter)) {
    			formatted_string = formatted_string.replace(String.valueOf(letter), "*");
    		}
    		
    		if (Character.isDigit(letter)) {
    			formatted_string = formatted_string.replace(String.valueOf(letter), "*");
    		}
    		
    		if (Character.isISOControl(letter)) {
    			formatted_string = formatted_string.replace(String.valueOf(letter), "CTRL");
    		}
    		
    		if (String.valueOf(letter).equals("-")) {
    			formatted_string = formatted_string.substring(0, i) + 
    					formatted_string.substring(i+1,i+2).toUpperCase() + formatted_string.substring(i+2);
    			formatted_string = formatted_string.replace("-", "");
    		}
    		
    		if (Character.getName(letter).contains("GREEK SMALL")) {
    			formatted_string = formatted_string.replace(String.valueOf(letter), "");
    		}
    	}
    	formatted_string = formatted_string.replace("*", "");
    	return formatted_string;
    }
}
