package stringsPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharacter {
    static List<Character> uniqueChars(String word){
        return word.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(mapData->mapData.getValue()==1)
                .map(mapData->mapData.getKey())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        String input = "abcdabc";
        Map<Character,Integer> frequency = new LinkedHashMap<>();
        for (char c : input.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        frequency.forEach((k,v)-> System.out.println(k+" : "+v));
        List<Character> uniqueCharList = new ArrayList<>();
        for (Map.Entry<Character,Integer> ch : frequency.entrySet()){
            uniqueCharList.add(ch.getKey());
        }
        System.out.println("Unique List : "+uniqueCharList);
        System.out.println(uniqueChars(input));
    }
}
