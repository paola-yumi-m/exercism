class Scrabble {

	private String word;
    Scrabble(String word) {
    	this.word = word.toLowerCase();
    }

    int getScore() {
    	int score = 0;
    	for (int i=0; i < word.length(); i++) {
    		if (word.charAt(i) == 'a' ||
    			word.charAt(i) == 'e' ||
    			word.charAt(i) == 'i' ||
    			word.charAt(i) == 'o' ||
    			word.charAt(i) == 'u' ||
    			word.charAt(i) == 'l' ||
    			word.charAt(i) == 'n' ||
    			word.charAt(i) == 'r' ||
    			word.charAt(i) == 's' ||
    			word.charAt(i) == 't') {
    			score += 1;
    		} else if (word.charAt(i) == 'd' ||
    				   word.charAt(i) == 'g') {
    			score += 2;
    		} else if (word.charAt(i) == 'b' ||
    				   word.charAt(i) == 'c' ||
    				   word.charAt(i) == 'm' ||
    				   word.charAt(i) == 'p') {
    			score += 3;
    		} else if (word.charAt(i) == 'f' ||
 				       word.charAt(i) == 'h' ||
 				       word.charAt(i) == 'v' ||
 				       word.charAt(i) == 'w' ||
 				       word.charAt(i) == 'y') {
    			score += 4;
    		} else if (word.charAt(i) == 'k') {
    			score += 5;
    		} else if (word.charAt(i) == 'j' ||
    				   word.charAt(i) == 'x') {
    			score += 8;
    		} else if (word.charAt(i) == 'q' ||
    				   word.charAt(i) == 'z') {
    			score += 10;
    		}
		}
    	return score;
    }

}
