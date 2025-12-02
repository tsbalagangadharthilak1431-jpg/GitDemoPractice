package stringsPrograms;

import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {
    public static void main(String[] args) {
        int[] inputArray = {1,2,1,2,3,4,5};
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i=0;i<inputArray.length;i++){
            frequency.put(inputArray[i],frequency.getOrDefault(inputArray[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> map : frequency.entrySet()){
            if (map.getValue() == 1){
                System.out.println(map.getKey());
            }
        }
    }
}
