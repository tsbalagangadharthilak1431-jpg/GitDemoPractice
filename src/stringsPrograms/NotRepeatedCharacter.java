package stringsPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NotRepeatedCharacter {
    public static void main(String[] args) {
        String input = "abcdabc";
        Map<Character,Integer> inputMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray()){
            inputMap.put(ch, inputMap.getOrDefault(ch,0)+1);
        }
        inputMap.forEach((k,v) -> System.out.println(k+" : "+v));
        System.out.println("After Filter");
        inputMap.forEach((k,v) -> {if(v==1){
            System.out.println(k);
        }});
    }
}
