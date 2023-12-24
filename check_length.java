package array;

import java.util.Scanner;

public class check_length {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        System.out.println("enter the arrays");
        int arr[] = new int[size];
                for(int i=0;i<size;i++)
                {
                    arr[i] = sc.nextInt();
                }
        System.out.println("printed array elements");
        System.out.println(arr.length + " length of arrays");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i] + " " );
        }
    }
}