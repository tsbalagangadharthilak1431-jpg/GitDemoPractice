package stringsPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String data = "aaabc";
        char[] charData = data.toCharArray();
        Map<Character,Integer> frequencyData = new HashMap<>();
        for (char ch : charData){
            frequencyData.put(ch, frequencyData.getOrDefault(ch,0)+1);
        }
        System.out.println("Frequency : "+frequencyData);
    }
}
