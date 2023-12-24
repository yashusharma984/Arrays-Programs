package array;

import java.util.Scanner;

// --> 14,1,3,53,23,22, == --> 1,3,14,22,23,53
public class ascending_array_order
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a [] = new int [5];
        int temp=0;
        System.out.println("enter the element");
        for(int i =0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        for( int i =0;i<5;i++) // nested loop here
        {
            for(int j =0;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i =0;i<5;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}