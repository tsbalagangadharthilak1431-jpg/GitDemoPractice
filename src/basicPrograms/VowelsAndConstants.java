package basicPrograms;

public class VowelsAndConstants {
    public static void main(String[] args) {
        String name = "thilak";
        char[] charArray = name.toCharArray();
        int vowelsCount = 0;
        int constantsCount = 0;
        for (char c : charArray){
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){
                System.out.println("Vowel : "+c);
                vowelsCount++;
            }
            else {
                System.out.println("Constant : "+c);
                constantsCount++;
            }
        }
        System.out.println("Vowels Count : "+vowelsCount);
        System.out.println("Constants Cunt : "+constantsCount);
    }
}
