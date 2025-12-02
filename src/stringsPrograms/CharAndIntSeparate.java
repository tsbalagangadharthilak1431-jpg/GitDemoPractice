package stringsPrograms;

public class CharAndIntSeparate {
    public static void main(String[] args) {
        String inputstring = "Thilak123charan234";
        String letters = "", digits = "";
        for (char c : inputstring.toCharArray()){
            if (Character.isDigit(c)){
                digits = digits + c;
            }
            else {
                letters = letters + c;
            }
        }
        System.out.println("Letters : "+letters);
        System.out.println("Numbers : "+digits);
    }
}
