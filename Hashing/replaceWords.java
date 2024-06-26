package Hashing;

import java.util.List;

class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split("\\s+");
        String answer = "";

        for (String word: words) {
            for (String root: dictionary) {
                if (word.startsWith(root)) {
                    word = root;
                }
            }
            answer = answer + " " + word; 
        }

        return answer.trim();
    }
}