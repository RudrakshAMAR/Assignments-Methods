package ASSIGNMENTS;

import java.util.Scanner;

public class squares_Of_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        squares(n);
    }

    private static void squares(int n) {
        for(int i=1;i<=n;i++){
            System.out.println(i*i);
        }
    }
}
