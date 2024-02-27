package controller;
import view.DictionaryView;
import model.Dictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
        // Initialize with some words
        dictionary.addWord("hello", "a greeting");
        dictionary.addWord("world", "the earth and its inhabitants");
    }

    public String search(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }
        try {
            return dictionary.searchWord(word);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class, args);
    }
}