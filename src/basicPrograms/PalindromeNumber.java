package basicPrograms;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12121;
        int temp = number;
        int reverseNumber = 0;
        while(number > 0){
            reverseNumber = reverseNumber*10 + number%10;// Last value will come for modulo 10
            number = number/10;// last value will be removed and remaining values will be present
        }
        System.out.println(temp == reverseNumber ? "Palindrome" : "Not Palindrome");
    }
}
