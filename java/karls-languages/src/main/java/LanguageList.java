import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
    	if (languages.isEmpty()) {
    		return true;
    	}
    	return false;
    }

    public void addLanguage(String language) {
    	languages.add(language);
    }

    public void removeLanguage(String language) {
    	languages.remove(languages.indexOf(language));
    }

    public String firstLanguage() {
    	return languages.get(0);
    }

    public int count() {
    	return languages.size();
    }

    public boolean containsLanguage(String language) {
    	for (String i:languages) {
    		if (i.equals(language)) {
    			return true;
    		}
    	}
    	return false;
    }

    public boolean isExciting() {
    	if (languages.indexOf("Java") == -1 && languages.indexOf("Kotlin") == -1) {
    		return false;
    	}
    	return true;
    }
}
