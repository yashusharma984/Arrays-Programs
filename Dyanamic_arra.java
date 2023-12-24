package array;

import java.util.Scanner;

public class Dyanamic_arra {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("printed array");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }
}
}