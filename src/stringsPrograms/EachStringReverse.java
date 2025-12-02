package stringsPrograms;


public class EachStringReverse {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = "";
        String[] words = input.split(" ");
        for (String msg : words){
            StringBuilder bufferedReader = new StringBuilder(msg);
            result = result+bufferedReader.reverse().toString() + " ";
        }
        System.out.println("Reverse Result : "+result);
    }
}
