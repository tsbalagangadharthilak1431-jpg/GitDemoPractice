package stringsPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // If two strings have same frequency of characters and same characters
        // Using Sort
        String name1 = "listen";
        String name2 = "silent";
        System.out.println(name1+" and "+name2+" is Anagram : "+isAnagram(name1,name2));
    }
    static boolean isAnagram(String str1,String str2){
        str1 = str1.replaceAll("\\s","").toLowerCase();// "\\s" means spaces removing spaces in the string
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
            // If length are not equal then it will not be Anagram
            return false;
        }
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        return Arrays.equals(charStr1,charStr2);
    }
}
