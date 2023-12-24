package array;

import java.util.Scanner;

public class length_copy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrays");
        int size = sc.nextInt();
        System.out.println("enter the arrays");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("printed arrays here");
        for(int i =0;i<size;i++)
        {
            System.out.println( arr[i] + "  ");
        }
        System.out.println(arr.length + " length of arrays");
    }
}