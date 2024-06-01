package ASSIGNMENTS;

import java.util.Scanner;

public class odd_Nums_between_a_and_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        print(num1,num2);
    }

    private static void print(int num1, int num2) {
        for(int i=num1;i<=num2;i++){
            if(i%2!=0) System.out.println(i);
        }
    }
}
