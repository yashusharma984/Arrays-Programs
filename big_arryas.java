package array;

import java.util.Scanner;

public class big_arryas {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int max =0;
        System.out.println("enter the size");
        int size = sc.nextInt();
        int a[]= new int[size];
        System.out.println("enter the arrays");
        for(int i =0;i<a.length;i++)
        {
            a[i]= sc.nextInt();
        }
        max=a[0];
        for(int i =1;i< a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum arrya value" + max);
    }
}