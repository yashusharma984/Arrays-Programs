package array;

import java.util.Scanner;

public class asscending_cipt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        int temp=0;
        System.out.println("enter the arrays");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
//                if(a[i]>a[j]) // for ascending
                if(a[i]<a[j]) // for decending
                {
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("ascedning order");
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i] + " ");
        }
    }
}