package array;

import java.util.Scanner;

public class reverse_order {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element ");
        int a[] = new int[5];
        for(int i=0; i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.print("now print the array");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("reverse order");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i] + " ");
        }
    }
}