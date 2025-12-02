package stringsPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is a Programing language Java Java";
        String[] words = sentence.split("\\s");// Based on spaces we are splitting the sentence
        Map<String,Integer> map = new HashMap<>();
        for (String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }
}
