package basicPrograms;

public class ReverseMethod {
    public static void main(String[] args) {
        String name = "Thilak";
        String reverse = new StringBuilder(name).reverse().toString();// By using String Builder
        System.out.println("Reverse String : "+reverse);
    }
}
