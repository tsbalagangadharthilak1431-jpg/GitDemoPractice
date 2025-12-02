package basicPrograms;


public class ReverseString {
    public static void main(String[] args) {
        String name = "thilak";
        char[] charName = name.toCharArray();
        String reverse = "";
        for (int i=charName.length-1;i>=0;i--){
            reverse = reverse + charName[i];
        }
        System.out.println("Reverse : "+reverse);
    }
}
