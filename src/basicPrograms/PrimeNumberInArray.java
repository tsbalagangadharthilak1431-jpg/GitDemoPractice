package basicPrograms;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,6,88,9,10,6,5};
        int count;
        Set<Integer> result = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            count = 0;
            int arrayValue = arr[i];
            for (int j=1;j<=arrayValue;j++){
                if (arrayValue%j==0){
                    count++;
                }
            }
            if(count == 2){
                result.add(arrayValue);
                System.out.println("Prime Number : "+arrayValue);
            }
        }
        System.out.println("Set : "+result);
    }
}
