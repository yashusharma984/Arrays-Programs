package array;

import java.util.Arrays;
import java.util.Scanner;

public class sort_methods {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the array");
        for(int i =0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("print arrays"); // automatically arrangw in order
        Arrays.sort(a);
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}