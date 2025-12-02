package basicPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1,sum,number = 5;
        for (int i=0;i<number;i++){
            System.out.println(a);
            sum = a+b;
            a=b;
            b=sum;
        }
    }
}
