package stringsPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String input = "abcdabceabcd";
        Set<Character> setValues = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < input.length(); right++) {
            while (setValues.contains(input.charAt(right))) {
                setValues.remove(input.charAt(left));
                left++;
            }
            setValues.add(input.charAt(right));
            max = Math.max(max, (right - left) + 1);
        }
        System.out.println("Max Sub String Value : "+max);
    }
}
