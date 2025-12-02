package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String inputString = "aabcber";
        Map<Character,Integer> frequency = new HashMap<>();
        for (char c : inputString.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> map : frequency.entrySet()){
            if (map.getValue() == 1){
                System.out.println(map.getKey());
            }
        }
    }
}
