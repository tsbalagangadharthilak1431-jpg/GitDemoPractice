package basicPrograms;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial : "+factorialNumber(5));
    }
    static int factorialNumber(int n){
        return (n==0 ? 1 : n*factorialNumber(n-1)); // 5 factorial is 5 * 4 * 3 * 2 * 1
    }
}
