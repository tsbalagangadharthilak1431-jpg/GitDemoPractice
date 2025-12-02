package stringsPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsString {
    public static void main(String[] args) {
        String input = "He is a Good Boy He Good";
        String[] words = input.split(" ");
        Map<String,Integer> frequency = new HashMap<>();
        for (String word : words){
            frequency.put(word, frequency.getOrDefault(word,0)+1);
        }
        frequency.forEach((k,v)->{
            if (v>1){
                System.out.println("Duplicate String : "+k);
            }
        });
    }
}
