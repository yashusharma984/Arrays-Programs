package array;

import java.util.Scanner;

public class descending_arr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a [] = new int [5];
        int temp=0;
        System.out.println("enter the element");
        for(int i =0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("descending order here ");
        for( int i =0;i<a.length;i++) // nested loop here
        {
            for(int j =i+1;j<a.length;j++) // descending order
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i] =a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
    }
