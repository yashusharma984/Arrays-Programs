package array;

import java.util.Scanner;

public class reverse_copy {
    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        System.out.println("enter the array elements");
        int arr[] = new int[size];
                for(int i =0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();
                }
        System.out.println("printed array elements");
                for(int i =0;i<arr.length;i++) {
                    System.out.print(arr[i] + " ");
                }
        System.out.println("now printed the array in reverse");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
    }
}