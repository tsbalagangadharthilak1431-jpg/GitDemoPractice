package stringsPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        // input is swiss output is w because w freq is 1 it is first character which have freq 1
        String name = "swiss";
        System.out.println("First Non Repeated Character in the String - "+name+" is : "+firstNonRepeatedCharacter(name));
    }
    static Character firstNonRepeatedCharacter(String name){
        Map<Character,Integer> nameMap = new LinkedHashMap<>();// Here we are using linked hashmap because it will not disturb the order of characters in the input string, hashmap will not be follow the input string order
        for (char c : name.toCharArray()){
            nameMap.put(c,nameMap.getOrDefault(c,0)+1);
        }
        // Map.Entry to get the values from the map based on value we are getting the char
        for (Map.Entry<Character,Integer> entry : nameMap.entrySet()){// To get the values we are using entrySet()
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
