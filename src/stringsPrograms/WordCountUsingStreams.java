package stringsPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordCountUsingStreams {
    public static void main(String[] args) {
        String input = "RamSita are Couples ramSita";
        String[] words = input.split("\\s");
        Map<String,Integer> wordFrequency = new HashMap<>();
        for (String word : words){
            wordFrequency.put(word.toLowerCase(),wordFrequency.getOrDefault(word.toLowerCase(),0)+1);
        }
        // Here toLowercase is optional
        wordFrequency.forEach((k,v) -> System.out.println(k+" : "+v));
    }
}
