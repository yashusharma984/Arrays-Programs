package array;

import java.util.Scanner;

public class avg_array_copy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int avg=0;
        int arr[] = new int[5];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("printed elements");
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " " );
            sum = sum+ arr[i];
            avg = sum/5;
        }
        System.out.println(" sum of elements" + sum );
        System.out.println("avg of elements" +  avg);
    }
}