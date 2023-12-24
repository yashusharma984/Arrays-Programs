package array;

import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;
        System.out.println("enter the elemnts here");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(" print array elements here");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
            sum = a[i] + sum;
        }
        System.out.println("addition of sum " + sum);
    }
}