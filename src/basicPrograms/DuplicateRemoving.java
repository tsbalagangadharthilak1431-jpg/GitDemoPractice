package basicPrograms;


import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoving {
    public static void main(String[] args) {
        String name = "programming";
        char[] charName = name.toCharArray();
        Set<Character> setChar = new HashSet<>();
        for (char ch : charName){
            setChar.add(ch);
        }
        System.out.println("Unique Characters : "+setChar);
    }
}
