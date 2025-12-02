package stringsPrograms;

public class Add1ToEachChar {
    public static void main(String[] args) {
        String inputString = "abcd";
        String outputString = "";
        for (char c : inputString.toCharArray()){
            outputString = outputString + (char)(c+1);
        }
        System.out.println("Output String : "+outputString);
    }
}
