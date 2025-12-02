package basicPrograms;

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number == armstrongMethod(number) ? "Armstrong" : "Not Armstrong");
    }
    static int armstrongMethod(int n){
        int sum = 0;
        while(n>0){
            int last = n%10;
            sum = sum + last * last * last;
            n = n/10;
        }
        return sum;
    }
}
