package array;

import java.util.Scanner;

public class avg_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int avg =0;
        int sum =0;
        System.out.println("enter the elements");
        for(int i =0 ;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("print the elments in revrse" );
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i] + " ");
            sum = a[i] + sum;
            avg = sum/5;
        }
        System.out.print("sum of array " + sum + " and average of " +
                "arrays " + avg);
    }
}