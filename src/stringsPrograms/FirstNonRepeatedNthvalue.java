package stringsPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedNthvalue {
    public static void main(String[] args) {
        String input = "swisse";
        Map<Character,Integer> frequency = new LinkedHashMap<>();//Linked hashmap will not disturb the insertion order
        for (char c : input.toCharArray()){
            frequency.put(c,frequency.getOrDefault(c,0)+1);
        }
        System.out.println("Frequency of each Character : "+frequency);
        int count =0;
        int n = 3;
        // Map.entry is used to get the key based on values
        for (Map.Entry<Character,Integer> ele: frequency.entrySet()){
            if (ele.getValue() == 1){
                count++;
                if (count == n){
                    System.out.println(n+" th First Non Repeated Value is : "+ ele.getKey());
                }
            }
        }
    }
}
