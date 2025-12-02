package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class IntegerCountInArray {
    public static void main(String[] args) {
        int[] inputArray = {1,3,0,1,0,2,5,9,10,10,11,11,1};
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i=0;i<inputArray.length;i++){
            frequency.put(inputArray[i],frequency.getOrDefault(inputArray[i],0)+1);
        }
//        frequency.forEach((k,v)-> {
//            if(v >= 2)
//                System.out.println("Value Occured more than 2 times : "+k);
//        });
        for (Map.Entry<Integer,Integer> map : frequency.entrySet()){
            if (map.getValue()>=2){
                System.out.println("More than 2 Freq : "+map.getKey());
            }
        }
    }
}
