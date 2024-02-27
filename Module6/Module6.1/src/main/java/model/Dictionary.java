package model;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words = new HashMap<>();

    public void addWord(String word, String meaning) {
        words.put(word, meaning);
    }

    public String searchWord(String word) throws Exception {
        if (words.containsKey(word)) {
            return words.get(word);
        } else {
            throw new Exception("Word not found");
        }
    }
}
