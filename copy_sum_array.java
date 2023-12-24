package array;

import java.util.Scanner;

public class copy_sum_array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size pof arrays");
        int size = sc.nextInt();
        int sum =0;
        int arr[] = new int[size];
        System.out.println("enter the arays");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("printed arrays");
        for(int i =0;i<size;i++)
        {
            System.out.println(arr[i] + " ");
            sum = sum +arr[i];
        }
        System.out.println("sumission of arrays" + sum);
    }
}