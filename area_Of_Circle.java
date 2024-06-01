package ASSIGNMENTS;

import java.util.Scanner;

public class area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        double ans=area(n);
        System.out.println(ans);
    }

    private static double area(float n) {
        double area_Circle= (3.14)*n*n;
        return area_Circle;
    }
}
