package stringsPrograms;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] data = {1,2,1,2,3,4,5,6,7,7,7,8};
        Set<Integer> uniqueSetData = new HashSet<>();
        for (int i=0;i<data.length;i++){
            uniqueSetData.add(data[i]);
        }
        System.out.println("Unique Elements : "+uniqueSetData);
    }
}
