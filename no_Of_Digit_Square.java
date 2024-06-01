package ASSIGNMENTS;

import java.util.Scanner;

public class no_Of_Digit_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        square(num);
    }

    private static void square(int num) {
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println(count*count);
    }
}
