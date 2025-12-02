package basicPrograms;

public class PalindromeString {
    public static void main(String[] args) {
        String inputString = "MADAM";
        String reverse = new StringBuilder(inputString).reverse().toString();
        System.out.println(inputString.equals(reverse) ? "Palindrome" : "Not Palindrome"); // If true first will be output or else second will be output
        // These are case-sensitive
        // reverse By using for loop to char array
        char[] inputCharArray = inputString.toCharArray();
        String resultCharArray = "";
        for (int i=inputString.length()-1;i>0;i--){
            resultCharArray = resultCharArray + inputCharArray[i];
        }
        if (inputString.equals(resultCharArray.toString())){
            System.out.println("Palindrome using For Loop");
        }
        else {
            System.out.println("Not Palindrome using For Loop");
        }
    }
}
