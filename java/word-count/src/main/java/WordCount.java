import java.util.HashMap;
import java.util.Map;

public class WordCount {
	
	private Map<String, Integer> wordMap = new HashMap<String, Integer>();
	int counter = 0;
	String[] words;
	 
	public Map<String, Integer> phrase(String phrase) {
		
		words = phrase.split("[ :\n\t,.]");
		for (String word: words) {	
			word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
			String wordLowerCase = word.toLowerCase();
			if (word != "") {
				if (wordMap.get(wordLowerCase) == null) {				
					counter = 1;
				} 
				else {
					counter = wordMap.get(wordLowerCase) + 1;
				}
				this.wordMap.put(wordLowerCase, counter);
			}
			
		}
		return this.wordMap;
	}
	
}