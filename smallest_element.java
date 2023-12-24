package array;

import java.util.Scanner;

public class smallest_element {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int min=0;
        System.out.println("enter the element");
        for(int i =0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        min=a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]<min)
            {
                min =a[i];
            }
        }
        System.out.println("smallest lement " + min);
    }
}