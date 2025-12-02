package basicPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        number = sc.nextInt();
        int count = 0;
        for (int i = 1;i<=number;i++){
            if (number%i==0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime Number : "+number);
        }
        else {
            System.out.println("Not Prime Number : "+number);
        }
    }
}
